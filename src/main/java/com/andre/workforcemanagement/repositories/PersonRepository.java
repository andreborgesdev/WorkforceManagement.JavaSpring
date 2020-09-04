package com.andre.workforcemanagement.repositories;

import com.andre.workforcemanagement.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
