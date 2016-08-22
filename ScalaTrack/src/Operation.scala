package cloudwick.dev.scala

trait Operation {
  def < (that: Any): Boolean
}

class MyDate(y: Int, m: Int, d: Int) extends Operation {
  val year = y
  val month = m
  val day = d
  def < (that: Any): Boolean = {
    if(!this.isInstanceOf[MyDate]){
      sys.error("Cannot compare "+ that +" with Date")
    }
    val data = that.asInstanceOf[MyDate]
    (year < data.year) || (year == data.year && (month < data.month || (month == data.month && day < data.day)))
  }
  
  /*
   * TODO: implement function for : > , >=. <= 
   * */
}

object MyDateText extends App {
  var date1 = new MyDate(2016,12,11)
  var date2 = new MyDate(2016,12,12)
  println(date1<date2)
}