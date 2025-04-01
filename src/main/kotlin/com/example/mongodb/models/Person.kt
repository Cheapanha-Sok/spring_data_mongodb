package com.example.mongodb.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collation = "persons")
data class Person(
    @Id
    var id : String?,
    var firstName : String?,
    var lastName : String?,
)