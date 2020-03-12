package dev.neyerdavid.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dev.neyerdavid.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
