object InitialWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  class Car(var year: Int, var miles: Int) {
    println("Creating car Object")
    def this(year: Int) = {
      this(year, 0)
    }
    def drive(distance:Int) = {
      miles += distance
      miles
    }
  }
  var obj2 = new Car(2014)                        //> Creating car Object
                                                  //| obj2  : InitialWorksheet.Car = InitialWorksheet$$anonfun$main$1$Car$1@788aa2
                                                  //| 9e
  var obj = new Car(2014, 2000)                   //> Creating car Object
                                                  //| obj  : InitialWorksheet.Car = InitialWorksheet$$anonfun$main$1$Car$1@55ba70e
                                                  //| 5
  println(obj.drive(2000))                        //> 4000
  println(obj.drive(2000))                        //> 6000
  println(obj.drive(2000))                        //> 8000
  println(obj.miles)                              //> 8000
  println(obj.year)                               //> 2014
  println(obj drive 3000)                         //> 11000
}