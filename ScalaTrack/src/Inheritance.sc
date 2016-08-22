package cloudwick.dev.scala

import com.sun.javafx.scene.paint.GradientUtils.Point

object Inheritance {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //create trait
  trait Friend{
  	val name : String
  	def listen = "I am " + name + " friend"
  }
  
  class Human(val name: String) extends Friend
  class Animal(val name: String)
  class Dog(override val name: String) extends Animal(name) with Friend
  
  val john = new Human("John")                    //> john  : cloudwick.dev.scala.Inheritance.Human = cloudwick.dev.scala.Inherita
                                                  //| nce$$anonfun$main$1$Human$1@566776ad
  john.listen                                     //> res0: String = I am John friend
  
  //extend or implement while object creation
  val  data = new Animal("snow") with Friend      //> data  : cloudwick.dev.scala.Inheritance.Animal with cloudwick.dev.scala.Inhe
                                                  //| ritance.Friend = cloudwick.dev.scala.Inheritance$$anonfun$main$1$$anon$1@6aa
                                                  //| a5eb0
  data.listen                                     //> res1: String = I am snow friend
	
	
	//overriding
	class Point(x:Int, y:Int){
		var ix=x
		var iy=y
		def +(newPt: Point): Point = {
			new Point(ix + newPt.ix, iy + newPt.iy)
		}
		def -(newPt: Point): Point = {
			new Point(ix - newPt.ix, iy - newPt.iy)
		}
		override def toString = "Point ("+ ix +","+ iy +")"
	}
	
	//
	val p1 = new Point(11,12)                 //> p1  : cloudwick.dev.scala.Inheritance.Point = Point (11,12)
	val p2 = new Point(1,2)                   //> p2  : cloudwick.dev.scala.Inheritance.Point = Point (1,2)
	println(p1 - p2)                          //> Point (10,10)
	println(p1 + p2)                          //> Point (12,14)
	
	//switch case in scala
	//matchcase
}