# Redis-Pub-Sub
Redis Publisher/Subscriber example
## Install
### Install Redis
* Local Or Docker install (select only one)
#### Local
[https://redis.io/download](https://redis.io/download) <br>
#### Redis for docker
```
docker run -d --name redis -p 6379:6379 redis:4.0.1
```
## HOW TO
### Redis Command Line Interface Subscribe  
```
redis-cli subscribe ch1
```
### Redis Command Line Interface Publisher
```
redis-cli publish ch1 "hey everybody"
```
### Run application
```
./gradlew clean build && java -jar build/libs/pubSub-0.0.1-SNAPSHOT.jar
```
