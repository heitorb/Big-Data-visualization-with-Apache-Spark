package word.count.spark;

import java.util.Arrays;
import java.util.List;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;

  public class WordCount {   //this class counts the characters
	  
	  public static void main(String[] args){
		  Counter();
		  
		  private static void Counter(){
			  
			 SparkConf conf = new SparkConf().setAppName("WordCount").setMaster("local"); 
			   JavaSparkContext wccontest = new JavaSparkContext(conf);
			     
			   JavaRDD<String> test = context.textFile("C://input.txt"); //here you insert the address of the file you want to count the words
				
				
			   JavaRDD<String> words = input.flatMap(new FlatMapFunction<String, String>(){
			    	
				 @Override
				 public Iterable<String> call(String t) throws Exception{
					return Arrays.asList(t.split(" "));  }		
			 });
				
			   JavaRDD<String, Integer> count = words.mapToPair(new PairFunction<String, String, Integer>(){
				 @Override
				 public Tuple<String, Integer> call(String t) throws Exception{
				 	return new Tuple(t, 1);  }	
				
			});
			
			   
			   JavaRDD<String, Integer> rcount  = count.reduceByKey(new Function<Integer, Integer, Integer>(){
			     @Override
				  public Integer call(Integer a, Integer b) throws Exception{
				 	return a + b;  }	
			   
		     });
			   
			   rcount.saveAsTextFile("C://output.txt") //inform your diretory in which you want to save the results
			   
    }
  }
}
