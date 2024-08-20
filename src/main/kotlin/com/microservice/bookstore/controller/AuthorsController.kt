package com.microservice.bookstore.controller

import com.microservice.bookstore.domain.dto.AuthorDto
import com.microservice.bookstore.services.AuthorService
import com.microservice.bookstore.toAuthorDto
import com.microservice.bookstore.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto> {
        val createdAuthor = authorService.save(authorDto.toAuthorEntity()).toAuthorDto()
        return ResponseEntity<AuthorDto>(createdAuthor, HttpStatus.CREATED)
    }
}