package cloudwick.dev.scala

object Collections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //populating a list
  //By default collections are immutable
  val list2 = List(1,2,3)                         //> list2  : List[Int] = List(1, 2, 3)
  
  val list3 = List[Number] (1, 2.0, 3d)           //> list3  : List[Number] = List(1, 2.0, 3.0)
  
  val list4 = List.range(1 , 10)                  //> list4  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  val list5 = List.tabulate(5)(n=>n*n)            //> list5  : List[Int] = List(0, 1, 4, 9, 16)

	var list6 = collection.mutable.ListBuffer(1,2,3)
                                                  //> list6  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3)
                                                  
	list6+=4                                  //> res0: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
	list6+=5                                  //> res1: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 5)
	list6-=4                                  //> res2: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 5)
	list6+=(6,7,8)                            //> res3: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 5, 6, 7
                                                  //| , 8)
	
	//merging the list
	val list7 = List(4,5,6)                   //> list7  : List[Int] = List(4, 5, 6)
	val list8 = list2 ++ list7                //> list8  : List[Int] = List(1, 2, 3, 4, 5, 6)
	val list9 = list2 ::: list7               //> list9  : List[Int] = List(1, 2, 3, 4, 5, 6)
	val list10 = List.concat(list2, list7)    //> list10  : List[Int] = List(1, 2, 3, 4, 5, 6)
	
	//map
	val states = Map("AL"->"Alabama","CA"->"California", "FR"->"Florida")
                                                  //> states  : scala.collection.immutable.Map[String,String] = Map(AL -> Alabama,
                                                  //|  CA -> California, FR -> Florida)
	val states2 = collection.mutable.Map("AL"->"Alabama","CA"->"California", "FR"->"Florida")
                                                  //> states2  : scala.collection.mutable.Map[String,String] = Map(AL -> Alabama, 
                                                  //| CA -> California, FR -> Florida)
	states2 += ("TX"->"Texas")                //> res4: cloudwick.dev.scala.Collections.states2.type = Map(AL -> Alabama, CA -
                                                  //| > California, TX -> Texas, FR -> Florida)
	states2 -= ("TX")                         //> res5: cloudwick.dev.scala.Collections.states2.type = Map(AL -> Alabama, CA -
                                                  //| > California, FR -> Florida)
}