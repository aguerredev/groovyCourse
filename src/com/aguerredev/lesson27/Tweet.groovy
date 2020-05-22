package com.aguerredev.lesson27

import groovy.transform.ToString

@ToString
class Tweet {
    String user
    String message
    int likes
    int retweets

    String toString() {
        "User: " + user + " - Message: " + message + " - Likes: " + likes + " - Retweets: " + retweets
    }
}
