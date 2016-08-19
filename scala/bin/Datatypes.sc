object Datatypes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  "101".toInt                                     //> res0: Int = 101
  
  //over riding default data type
  var data = 1:Int                                //> data  : Int = 1
  var data2 = 1d                                  //> data2  : Double = 1.0
  var data3 = 1f                                  //> data3  : Float = 1.0
  var data4 = 1:Float                             //> data4  : Float = 1.0
  
  //Increment or decrement
  data += 4
  
  //Handling large datasets
  var data5 = BigInt(1234567890)                  //> data5  : scala.math.BigInt = 1234567890
  
  //generating Random Number
  var data6 = scala.util.Random                   //> data6  : util.Random.type = scala.util.Random$@12786119
 	data6.nextInt()                           //> res1: Int = -925350491
 	
 	//creating range of value
 	var data7 = 1 to 30                       //> data7  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6
                                                  //| , 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 2
                                                  //| 6, 27, 28, 29, 30)
	var data8 = 1 to 30 by 3                  //> data8  : scala.collection.immutable.Range = Range(1, 4, 7, 10, 13, 16, 19, 2
                                                  //| 2, 25, 28)
	
	//looping through collection
	for(i <- 1 until 5){
		println("Hello" + i)              //> Hello1
                                                  //| Hello2
                                                  //| Hello3
                                                  //| Hello4
	}
	
		var data9 = (1 to 10).toArray     //> data9  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		data9(1)                          //> res2: Int = 2
		
		var data10 = 1 to 10 toList       //> data10  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		
		//String Equality
		var s1 = "Hello"                  //> s1  : String = Hello
		var s2 = "Hello"                  //> s2  : String = Hello
		s1 == s2                          //> res3: Boolean = true
		var s3 = "hello"                  //> s3  : String = hello
		s1.toUpperCase()==s3.toUpperCase()//> res4: Boolean = true
		
		//multiline string
	var s4 = """ I am still
	using same string
	line 3 """                                //> s4  : String = " I am still
                                                  //| 	using same string
                                                  //| 	line 3 "
	
	//datasplit
	"I live in fremont".split(" ").foreach (println)
                                                  //> I
                                                  //| live
                                                  //| in
                                                  //| fremont
	

	//"I, Live, in, Fremont."split(",").map(_.trim())
	
	//variable subsititution
	println(s"$s1 and $s4")                   //> Hello and  I am still
                                                  //| 	using same string
                                                  //| 	line 3 
	var age = 4                               //> age  : Int = 4
	println(s"$s1 my age is ${age + 4}")      //> Hello my age is 8
}