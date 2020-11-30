package com.example.voting.repository;

import com.example.voting.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional;

@RepositoryRestResource
public interface GenderRepository extends JpaRepository<Gender, Long> {
    Optional<Gender> findById(long gender_id);
}