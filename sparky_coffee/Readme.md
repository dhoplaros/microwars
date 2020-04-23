* Sparky Coffee

Java/Spark

Cause why not...

First get a fat JAR going:
```
./gradlew assemble
```
Assuming GraalVM and native-image are installed:
```
native-image --no-server -cp build/libs/sparky*-all.jar
```