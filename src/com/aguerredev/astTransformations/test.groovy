package com.aguerredev.astTransformations

/*
Use some AST Transformations
 */

//Builder annotation
Person person1 = Person
        .builder()
        .lastName("Aguerre")
        .firstName("Sebastian")
        .age((byte)32)
        .build()

//@NotNull will make this fail
/*Person person2 = Person
        .builder()
        .lastName("Aguerre")
        .firstName("Sebastian")
        .age(null)
        .build()*/

Person person3 = Person
        .builder()
        .lastName("Aguerre")
        .firstName("Jorge")
        .age((byte)33)
        .build()

Person person4 = Person
        .builder()
        .lastName("Benitez")
        .firstName("Gisela")
        .age((byte)32)
        .build()


def people = [person1, person3, person4]
println people
//Sortable
println people.sort()

//To String
people.each { person ->
    println person.toString()
}