package com.aguerredev.builders

import groovy.xml.MarkupBuilder

/*
[Exercise] MarkupBuilder
XML
Use the MarkupBuilder to generate the following XML

<books>
    <book isbn="978-1935182443">
        <title>Groovy in Action 2nd Edition</title>
        <author>Dierk Koenig</author>
        <price>50.58</price>
    </book>
    <book isbn="978-1935182948">
        <title>Making Java Groovy</title>
        <author>Ken Kousen</author>
        <price>33.96</price>
    </book>
    <book isbn="978-1937785307">
        <title>Programming Groovy 2: Dynamic Productivity for the Java Developer</title>
        <author>Venkat Subramaniam</author>
        <price>28.92</price>
    </book>
</books>


HTML
With the same data from the xml version build an HTML page that lists that data.

Bonus
Using a FileWriter write the contents of the HTML from the MarkupBuilder to a file.
* */

//Simple XML
MarkupBuilder markupBuilder = new MarkupBuilder()

markupBuilder.books {
    book(isbn : "978-1935182443") {
        title "Groovy in Action 2nd Edition";
        author "Dierk Koenig";
        price 50.58;
    }
    book(isbn : "978-1935182948") {
        title "Making Java Groovy";
        author "Ken Kousen";
        price 33.96;
    }
    book(isbn : "978-1937785307") {
        title "Programming Groovy 2: Dynamic Productivity for the Java Developer";
        author "Venkat Subramaniam";
        price 28.92;
    }
}

//HTML - Use a list of books and iterate and also write to an external html
FileWriter fileWriter = new FileWriter("html/index.html")
MarkupBuilder htmlMarkupBuilder = new MarkupBuilder(fileWriter)

List booksList = [
        [isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: 50.58],
        [isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.96],
        [isbn: "978-1937785307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: 28.92]
]

htmlMarkupBuilder.html {
    body{
        section {
            h2 "Books"
            table {
                tr {
                    th "isbn"
                    th "title"
                    th "author"
                    th "price"
                }
                booksList.each { book ->
                    tr {
                        td book.isbn
                        td book.title
                        td book.author
                        td book.price
                    }
                }
            }
        }
    }
}