package com.aguerredev.collections

/*
[Exercise] Using Collections
Ranges

If you are new to Java or Groovy the idea of an Enum might be new. An Enum is a collection of constant values.
We can use this collection of constants to create ranges. I want you to do some reading up on enum's and create an enum for days of the week. ex Sunday, Monday, etc...

Create a range from that enum
Print the size of the Range
Use the contains method to see if Wednesday is in that Range
Print the from element of this range
Print the to element of this range
Lists

Create a list days (Sun - Sat)
Print out the list
Print the size of the list
Remove Saturday from the list
Add Saturday back by appending it to the list
Print out the Wednesday using its index
Maps

Create a map of days of the week
1: Sunday, 2:Monday, etc...
Print out the map
Print out the class name of the map
Print the size of the map
Is there a method that would easily print out all of the days (values)?
Without closures you may have to look at the Java API for LinkedHashMap
* */

enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

def daysRange = Days.SUNDAY..Days.SATURDAY
println daysRange.getClass().getName()
println daysRange.size()
assert daysRange.contains(Days.WEDNESDAY)
println daysRange.from
println daysRange.to

def daysList = [Days.SUNDAY, Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY, Days.SATURDAY]
println daysList.getClass().getName()
println daysList
println daysList.size()
daysList.remove(Days.SATURDAY)
println daysList
daysList.add(Days.SATURDAY)
println daysList
println daysList[3]

def daysMap = [1:Days.SUNDAY, 2:Days.MONDAY, 3:Days.TUESDAY, 4:Days.WEDNESDAY, 5:Days.THURSDAY, 6:Days.FRIDAY, 7:Days.SATURDAY]
println daysMap.getClass().getName()
println daysMap
println daysMap.size()
println(daysMap.values())


def name = "Pepe"
def age = 40
def elvisOutput = age > 20 ?: -1
println elvisOutput
