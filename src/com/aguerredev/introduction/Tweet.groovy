package com.aguerredev.introduction

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
