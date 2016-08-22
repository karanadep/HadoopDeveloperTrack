package cloudwick.dev.scala

object timer {
  def main (args: Array[String]) {
    //
    //frequency(result)
    
    //anonymous function
    frequency { () => println("I got it") }
  }
  def frequency(callback: () => Unit) {
   while(true){callback(); Thread sleep 1000} 
  }
  def result(){
    println("Hello there")
  }
}