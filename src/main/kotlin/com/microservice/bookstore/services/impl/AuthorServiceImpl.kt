package com.microservice.bookstore.services.impl

import com.microservice.bookstore.domain.entities.AuthorEntity
import com.microservice.bookstore.repository.AuthorRepository
import com.microservice.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository): AuthorService {
    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }
}