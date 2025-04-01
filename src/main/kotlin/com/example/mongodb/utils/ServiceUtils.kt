package com.example.mongodb.utils

import com.github.f4b6a3.ulid.Ulid

object ServiceUtils {

    fun ulid(): String {
        val ulid: Ulid = Ulid.fast()
        return ulid.toString()
    }
}