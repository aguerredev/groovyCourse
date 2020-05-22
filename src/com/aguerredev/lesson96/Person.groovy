package com.aguerredev.lesson96

import groovy.transform.NullCheck
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.builder.Builder

@ToString(includeNames = true)
@Builder
@Sortable(includes = ["lastName", "firstName", "age"])
@NullCheck
class Person {
    String firstName
    String lastName
    byte age

}
