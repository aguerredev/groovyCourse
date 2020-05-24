import groovy.transform.ToString

/*
An example of how to use Object Graph Builder to create objects
 */

@ToString(includeNames = true)
class Book {
    String title
    String summary
    List<Section> sections = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter {
    String title
}

ObjectGraphBuilder builder = new ObjectGraphBuilder()

def book = builder.book(title: "Test Book", summary: "My Test Book") {
    section(title: "Section 1") {
        chapter(title: "Chapter 1")
        chapter(title: "Chapter 2")
    }
    section(title: "Section 2") {
        chapter(title: "Chapter 3")
        chapter(title: "Chapter 4")
    }
}


println book