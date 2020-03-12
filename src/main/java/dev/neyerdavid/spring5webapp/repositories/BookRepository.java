package dev.neyerdavid.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dev.neyerdavid.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository <Book, Long> {

}
