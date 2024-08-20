package com.microservice.bookstore.services

import com.microservice.bookstore.domain.entities.AuthorEntity

interface AuthorService {
    fun save(authorEntity: AuthorEntity): AuthorEntity
}