package com.senai.senai.service;

import com.senai.senai.models.Parts;

import java.util.List;
import java.util.UUID;

public interface PartsService {

    List<Parts> getAllParts();

    List<Parts> saveParts(List<Parts> parts);

    Parts updatePart(Parts part);

    void deletePart(UUID id);
}
