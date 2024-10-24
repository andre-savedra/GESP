package com.senai.senai.service;

import com.senai.senai.models.Robots;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.UUID;

public interface RobotsService {

    Page<Robots> getAllRobots(Pageable page, Specification<Robots> spec);

    List<Robots> saveRobots(List<Robots> robots);

    Robots updateRobot(Robots robot);

    void deleteRobot(UUID id);
}