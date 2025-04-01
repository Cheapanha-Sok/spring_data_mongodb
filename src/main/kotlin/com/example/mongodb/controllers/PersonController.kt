package com.example.mongodb.controllers

import com.example.mongodb.models.Person
import com.example.mongodb.services.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/persons")
class PersonController(
    private val personService: PersonService
) {

    @PostMapping
    fun create(@RequestBody person: Person): Person {
        return personService.create(person)
    }

    @GetMapping("/all")
    fun all() : List<Person> {
        return personService.all()
    }
}