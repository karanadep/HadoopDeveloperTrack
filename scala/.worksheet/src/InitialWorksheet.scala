object InitialWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  println("Welcome to the Scala worksheet")
  class Car(var year: Int, var miles: Int) {
    println("Creating car Object")
    def this(year: Int) = {
      this(year, 0)
    }
    def drive(distance:Int) = {
      miles += distance
      miles
    }
  };$skip(239); 
  var obj2 = new Car(2014);System.out.println("""obj2  : InitialWorksheet.Car = """ + $show(obj2 ));$skip(32); 
  var obj = new Car(2014, 2000);System.out.println("""obj  : InitialWorksheet.Car = """ + $show(obj ));$skip(27); 
  println(obj.drive(2000));$skip(27); 
  println(obj.drive(2000));$skip(27); 
  println(obj.drive(2000));$skip(21); 
  println(obj.miles);$skip(20); 
  println(obj.year);$skip(26); 
  println(obj drive 3000)}
}
