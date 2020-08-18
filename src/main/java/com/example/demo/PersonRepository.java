package com.example.demo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository extends PagingAndSortingRepository<Person, UUID> {
}
