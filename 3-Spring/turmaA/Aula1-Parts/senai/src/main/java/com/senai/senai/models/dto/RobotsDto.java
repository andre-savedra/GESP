package com.senai.senai.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senai.senai.models.Parts;
import com.senai.senai.models.Robots;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class RobotsDto implements Serializable {

    private UUID head;
    private UUID base;
    private UUID leftArm;
    private UUID rightArm;
    private UUID torso;
    private UUID userId;

    @JsonIgnore
    public Robots mapToRobot(){
        return Robots.builder()
                .head(Parts.builder().id(this.head).build())
                .base(Parts.builder().id(this.base).build())
                .leftArm(Parts.builder().id(this.leftArm).build())
                .rightArm(Parts.builder().id(this.rightArm).build())
                .torso(Parts.builder().id(this.torso).build())
                .userId(this.userId)
                .build();
    }
}
