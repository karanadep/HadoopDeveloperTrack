package cloudwick.dev.scala

  //head: first element
  //tail: remaining elements
  //for eg: 1,2,3,4 ; 1 - head; tail: 2,3,4

class MyStack[T] {
  var elems : List[T] = Nil
  /*
   * Push elements to the list
   * */
  //add one more element
  def push(x:T){ elems = x :: elems }
  
  /*
   * peek and give head element
   * */
  def top:T = elems.head
  
  /*
   * pop an element
   * */
  def pop(){
   elems = elems.tail
  }
}