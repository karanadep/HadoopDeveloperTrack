object Datatypes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(14); val res$0 = 
  "101".toInt;System.out.println("""res0: Int = """ + $show(res$0));$skip(56); 
  
  //over riding default data type
  var data = 1:Int;System.out.println("""data  : Int = """ + $show(data ));$skip(17); 
  var data2 = 1d;System.out.println("""data2  : Double = """ + $show(data2 ));$skip(17); 
  var data3 = 1f;System.out.println("""data3  : Float = """ + $show(data3 ));$skip(22); 
  var data4 = 1:Float;System.out.println("""data4  : Float = """ + $show(data4 ));$skip(42); 
  
  //Increment or decrement
  data += 4;$skip(64); 
  
  //Handling large datasets
  var data5 = BigInt(1234567890);System.out.println("""data5  : scala.math.BigInt = """ + $show(data5 ));$skip(64); 
  
  //generating Random Number
  var data6 = scala.util.Random;System.out.println("""data6  : util.Random.type = """ + $show(data6 ));$skip(18); val res$1 = 
 	data6.nextInt();System.out.println("""res1: Int = """ + $show(res$1));$skip(53); 
 	
 	//creating range of value
 	var data7 = 1 to 30;System.out.println("""data7  : scala.collection.immutable.Range.Inclusive = """ + $show(data7 ));$skip(26); 
	var data8 = 1 to 30 by 3;System.out.println("""data8  : scala.collection.immutable.Range = """ + $show(data8 ));$skip(77); 
	
	//looping through collection
	for(i <- 1 until 5){
		println("Hello" + i)
	};$skip(37); 
	
		var data9 = (1 to 10).toArray;System.out.println("""data9  : Array[Int] = """ + $show(data9 ));$skip(11); val res$2 = 
		data9(1);System.out.println("""res2: Int = """ + $show(res$2));$skip(33); 
		
		var data10 = 1 to 10 toList;System.out.println("""data10  : List[Int] = """ + $show(data10 ));$skip(42); 
		
		//String Equality
		var s1 = "Hello";System.out.println("""s1  : String = """ + $show(s1 ));$skip(19); 
		var s2 = "Hello";System.out.println("""s2  : String = """ + $show(s2 ));$skip(11); val res$3 = 
		s1 == s2;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(19); 
		var s3 = "hello";System.out.println("""s3  : String = """ + $show(s3 ));$skip(37); val res$4 = 
		s1.toUpperCase()==s3.toUpperCase();System.out.println("""res4: Boolean = """ + $show(res$4));$skip(80); 
		
		//multiline string
	var s4 = """ I am still
	using same string
	line 3 """;System.out.println("""s4  : String = """ + $show(s4 ));$skip(65); 
	
	//datasplit
	"I live in fremont".split(" ").foreach (println);$skip(107); 
	

	//"I, Live, in, Fremont."split(",").map(_.trim())
	
	//variable subsititution
	println(s"$s1 and $s4");$skip(13); 
	var age = 4;System.out.println("""age  : Int = """ + $show(age ));$skip(38); 
	println(s"$s1 my age is ${age + 4}")}
}
