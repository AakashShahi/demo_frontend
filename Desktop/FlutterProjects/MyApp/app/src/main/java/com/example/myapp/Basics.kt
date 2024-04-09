package com.example.myapp

fun main() {
  var name: String="Ram"
  var len: Any=name.length
    println(len)
  var a= arrayListOf<Int>(1,2,3,4)
  println(a)
  var b= ArrayList<Any>()
  b.add(1)
  b.add("ram")
  mapTask()

}

fun mapTask(){

    var dictionary = mapOf(
      "eat" to "to consume food",
      "sleep" to "a natural state of rest for the body and mind",
      "food" to "any nutritious substance that people or animals eat or drink",
      "repeat" to "to do something again"
    )

    println("Enter a word: ")
    val word = readLine()
    println("Meaning is: ${dictionary[word]}")

}
