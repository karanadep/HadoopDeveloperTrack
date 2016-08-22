package cloudwick.dev.scala

object MyStackTest extends App {
  var stack = new MyStack[Int]
  stack.push(24)
  stack.push(21)
  stack.push(4)
  println(stack.top)
  stack.pop()
  println(stack.top)
}