# Word Counter using Java and Apache Spark

We've been used Apache Spark within Eclipse Neon 3.0 (with Java 8) as a dependency of Maven to build a Word Counter. Access the [Maven Repository](https://mvnrepository.com/) and search for Spark. We used Spark Version 2.1.0, but you can choose another version. After choosing your version, copy and paste the Maven dependency within the pom.xml file on Eclipse:

```
<dependencies>
  <dependency>
    <groupId>org.apache.spark</groupId>
    <artifactId>spark-core_2.10</artifactId>
    <version>2.1.0</version>
  </dependency>
</dependencies>
```

Salve and wait to download all the dependencies. You also need to have the Hadoop configured on your system. To do so, if you're using Windows, go to [Hadoop 2.6.0 Windows 64-bit Binarie](https://www.barik.net/archive/2015/01/19/172716), download and unpack the file:

```
hadoop-2.6.0-tar.gz
```

On Eclipse, go to Run > Run Configurations > Environment and create a New Environment Variable called Hadoop1 with value equals the Hadoop address on your computer (e.g. C://Hadoop/hadoop-2.6.0).


![alt text](https://raw.githubusercontent.com/heitorb/Word_Counter_using_Java_and_Spark/master/java.jpg) ![alt text](https://raw.githubusercontent.com/heitorb/Word_Counter_using_Java_and_Spark/master/spark.png) ![alt text](https://raw.githubusercontent.com/heitorb/Word_Counter_using_Java_and_Spark/master/hadoop.jpg) ![alt text](https://raw.githubusercontent.com/heitorb/Word_Counter_using_Java_and_Spark/master/maven.jpg)
