package com.aguerredev.builders

import groovy.json.JsonBuilder

JsonBuilder jsonBuilder = new JsonBuilder()

jsonBuilder.books {
    previousBook {
        isbn : "978-1935182443"
        title "Groovy in Action 2nd Edition"
        author "Dierk Koenig"
        price 50.58;
    }
    currentBook {
        isbn : "978-1935182948"
        title "Making Java Groovy"
        author "Ken Kousen"
        price 33.96
    }
    nextBook {
        isbn : "978-1937785307"
        title "Programming Groovy 2: Dynamic Productivity for the Java Developer"
        author "Venkat Subramaniam"
        price 28.92;
    }
}

println jsonBuilder.toPrettyString()