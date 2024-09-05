package com.senai.senai.repository;

import com.senai.senai.models.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PartsRepository
        extends JpaRepository<Parts, UUID>{
}
