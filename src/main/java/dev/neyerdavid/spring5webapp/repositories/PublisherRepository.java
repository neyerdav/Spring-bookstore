package dev.neyerdavid.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dev.neyerdavid.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
