package com.tboot

class Person {

    String firstName
    String lastName
    
    static constraints = {
        firstName blank:false
    }
}
