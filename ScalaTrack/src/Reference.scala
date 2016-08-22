package cloudwick.dev.scala

class Reference[T] {
  private var contents:T = _
  def set(value:T) { contents = value }
  def get : T = contents
  
}
object IntegerReference extends App {
  val data = new Reference[Integer]
  data.set(24)
  println(data.get)
  val data2 = new Reference[String]
  data2.set("Hiii")
  println(data2.get)
}


/*
 * companion class
 * 
 * 
 */

/*
 * sealed trait:
 * 
 * only class that extends trait will be able to access
 * Outside class will not be able to access it 
 * */
