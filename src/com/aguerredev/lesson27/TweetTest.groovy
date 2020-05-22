package com.aguerredev.lesson27

/*
In this exercise you are going to create your own class and start to think about what your class would contain.
There is no 1 correct answer for this. Follow the rules and see what you come up with.

Create a class called Tweet
Add properties to this class.
What properties would be present in a class that holds information about a tweet
Think about what their data types would be
What methods would go in this class?
How about a constructor to create a new tweet.
How about methods to change some of your properties?
How about a toString method (or AST Transformation)
Create a script called Twitter.
In this script create one or more Tweets.
print the Tweet instances to the console (and have their string representations shown)
* */

tweet1 = new Tweet(user: "Pepe", message: "Holaaaa", likes: 1, retweets: 4)
println tweet1

tweet2 = new Tweet()
tweet2.user = "Pedrito"
tweet2.message = "This is my message"
tweet2.likes = 0
tweet2.retweets = 0

println tweet2.toString()