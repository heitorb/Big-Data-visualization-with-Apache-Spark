package word.count.spark;

import java.util.Arrays;
import java.util.List;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.VoidFunction;

public class WCSpark {

	public static void main(String[] args){
		
		SparkConf conf = new SparkConf().setAppName("WCSpark").setMaster("local"); 
		JavaSparkContext wccontest = new JavaSparkContext(conf);
	
		List<String> L = Arrays.asList(new String[] {"Ex1", "Examp2", "Example3"}); //test string list
	
        JavaRDD<String> rdd = context.parallelize(L)	//string vector in the spark format
        		rdd.foreach(VoidFunction<String>(){
        			public void call(String x) throws Exception{
        				System.out.println(x);
        			}
        			
        		}
        		);
        		
	}
}
