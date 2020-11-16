#! /bin/bash
end=$((SECONDS+10))
i=0

while [ $SECONDS -lt $end ]; do
    wget -q --no-cache http://localhost:8080/run -O /dev/null
    i=$((i+1))
done

echo "${i} runs performed"
