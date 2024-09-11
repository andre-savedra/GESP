package com.senai.senai.repository;

import com.senai.senai.models.Robots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RobotsRepository
        extends JpaRepository<Robots, UUID>, JpaSpecificationExecutor<Robots> {
}
