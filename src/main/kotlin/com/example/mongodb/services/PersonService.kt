package com.example.mongodb.services

import com.example.mongodb.models.Person
import com.example.mongodb.repositories.PersonRepository
import com.example.mongodb.utils.ServiceUtils.ulid
import org.springframework.stereotype.Service

@Service
class PersonService(
    private val personRepository: PersonRepository
) {

    fun create(person: Person): Person {
        return personRepository.save(Person(
            id = ulid(),
            firstName = person.firstName,
            lastName = person.lastName,
        ))
    }

    fun all(): List<Person> {
        return personRepository.findAll()
    }
}