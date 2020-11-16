package com.safereach.codechallenge;

import com.safereach.codechallenge.donottouch.Data;
import com.safereach.codechallenge.donottouch.DoNotTouchProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@RestController
public class RunController {

    List<String> dataStringList = new ArrayList<>();

    @Autowired
    private DoNotTouchProcessor processor;

    @GetMapping("/run")
    public String run() {
        dataStringList.clear();

        int loadDuration = 10000;
        int repeatMS = 500;

        CountDownLatch lock = new CountDownLatch(loadDuration/repeatMS);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(loadDuration/repeatMS);
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            List<Data> dataList = processor.run();
            if(!dataList.isEmpty()) {
                dataStringList.add(dataList.toString());
            }
            lock.countDown();
        }, 0, repeatMS, TimeUnit.MILLISECONDS);

        try {
            lock.await(loadDuration, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        future.cancel(true);

        return dataStringList.toString();
    }

}
