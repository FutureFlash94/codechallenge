# safeREACH code challenge

Welcome to our code challenge.


## Get started

0. Make sure you have a running Java and Docker set up (scripts written for Linux)
1. Start the database with `make updb`
2. Startup the `SafeReachCodeChallengeApplication` to initialize the database
3. Fill test data into the database with `make init` 
4. Call `http://localhost:8080/run` in your browser
5. `make run` will call the test suite


### About the challenge

You encountered a package in the java code named `donottouch`. Which includes the `DoNotTouchProcessor`. It does some
strange calculations to process some `Data`. As a challenge participant it's your task to improve the execution speed
our `RunController` and optimize the `SafeReachCodeChallengeApplication`.
 

### Rules

 - Do not touch the code inside the `donottouch` package or `script/` folder.
 - Everything else is allowed - be creative


### Goal

 - Process as much data in 10 seconds as possible
 - Detect possible bottlenecks, showcase and solve them
 - Push your code to GitHub repository
 - Imagine multiple people work in this code case (issues, pull requests and commit messages matter)
 
We will take a look at the GitHub repo together and go over the code changes.
Afterwards I will clone the repo, start the application and execute `make run`.
 
 
### Bonus Goals (if your are "done" in under 2 hours or have some time left)
 
 - Setup a CI Github actions workflow for this application
 - Let GitHub actions create a docker image which is pushed to the GitHub package registry
