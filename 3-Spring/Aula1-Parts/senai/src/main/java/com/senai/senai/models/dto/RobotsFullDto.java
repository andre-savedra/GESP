package com.senai.senai.models.dto;

import com.senai.senai.models.Parts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RobotsFullDto implements Serializable {

    private UUID id;
    private Parts head;
    private Parts base;
    private Parts torso;
    private Parts leftArm;
    private Parts rightArm;
    private UserDto user;
    private LocalDateTime createdDate;
    private BigDecimal totalCost;
}
