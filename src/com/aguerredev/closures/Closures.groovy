package com.aguerredev.closures

/*
[Exercise] Using Closures
Closure Basics

Locate the class groovy.lang.Closure and spend a few minutes looking through documentation.

Create a Method that accepts a closure as an argument

Create a closure that performs some action

Call the method and pass the closure to it.

Create a list and use them each to iterate over each item in the list and print it out

Hint - You can use the implicit it or use your own variable

Create a map of data and iterate over it using each method.

This method can take a closure that accepts 1 or 2 arguments.

Use 2 arguments and print out the key and value on each line.

Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture.
 */

def methodAcceptingClosure(Closure aClosure, String name) {
    aClosure(name)
}

def closurePerformingAction = { name -> println "Hello ${name}"}

methodAcceptingClosure(closurePerformingAction, "Steve")

def aListOfNames = ["Pochi", "Mario", "Gisela", "Negro", "Gris"]

aListOfNames.each { println "Hello ${it}" }

def map = ["Country": "Germany", "Name": "Gisela", "Year": 1987, "Love": "Sebastian"]

map.each {key, value -> println "Your key is ${key} and your value is ${value}"}

def countryClosure = {country, name -> println "${name} comes from ${country}"}

def uruguayClosure = countryClosure.curry("Uruguay")

def anotherListOfNames = ["Pochi", "Mario", "Sebastian", "Negro", "Gris"]

anotherListOfNames.each { uruguayClosure("${it}") }