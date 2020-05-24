package com.aguerredev.runtimeMetaProgramming

import groovy.transform.ToString

/*
[Exercise] Runtime Metaprogramming
GroovyObject

Create a class and implement each of the following methods from the GroovyObject Interface

invokeMethod

getProperty

setProperty

 */

class Developer {
    String first
    String last
    String email
    List languages

    Developer() {}

    def invokeMethod(String name, Object args) {
        println "invokeMethod() called with args $args"
    }

    def getProperty(String property) {
        println "getProperty called"
        metaClass.getProperty(this, property)
    }

    void setProperty(String property, Object newValue) {
        println "setProperty called with name $property and newValue $newValue"
        metaClass.setProperty(this, property, newValue)
    }
}

Developer developer = new Developer(first: "Pepe", last: "Muleiro", email: "pepe@gmail.com")
developer.writeCode("Groovy")
println developer.first
developer.languages = ["Groovy", "Java"]


/*
Expando

Create an Expando Class

Add some properties and methods to it

Knowing that a class's metaclass is an expando to create your own class and add properties and methods to it.
 */

Expando e = new Expando()

e.first = "Pepe"
e.last = "Muleiro"
e.email = "pepe@gmail.com"

e.getFullName = {
    "$first $last"
}

println e.toString()
println e.getFullName()

@ToString(includeNames =  true)
class Person {
 String first, last
}

Person p = new Person (first: "Pepe", last: "Muleiro")
p.metaClass.email = "pepe@gmail.com"
println p
println p.email

/*
Times Two

Add a new method to the Integer class called `timesTwo`

This method should be available to any instance of Integer

What is another approach that we can take to create this method that would be a little more controlled?
 */

Integer.metaClass.timesTwo = {delegate * 2}

println 2.timesTwo()
println 4.timesTwo()
println 5.timesTwo()
println 6.timesTwo()