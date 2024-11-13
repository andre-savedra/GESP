package com.senai.senai.specifications;

import com.senai.senai.models.Robots;
import net.kaczmarzyk.spring.data.jpa.domain.EqualIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

public class RobotsSpecification {

    @And({
            @Spec(path = "head.title", params = "headTitle", spec = LikeIgnoreCase.class),
            @Spec(path = "base.title", params = "baseTitle", spec = LikeIgnoreCase.class),
            @Spec(path = "leftArm.title", params = "leftArmTitle", spec = LikeIgnoreCase.class),
            @Spec(path = "rightArm.title", params = "rightArmTitle", spec = LikeIgnoreCase.class),
            @Spec(path = "torso.title", params = "torsoTitle", spec = LikeIgnoreCase.class),

            @Spec(path = "head.type", params = "headType", spec = EqualIgnoreCase.class),
            @Spec(path = "base.type", params = "baseType", spec = EqualIgnoreCase.class),
            @Spec(path = "leftArm.type", params = "leftArmType", spec = EqualIgnoreCase.class),
            @Spec(path = "rightArm.type", params = "rightArmType", spec = EqualIgnoreCase.class),
            @Spec(path = "torso.type", params = "torsoType", spec = EqualIgnoreCase.class),

            @Spec(path = "head.id", params = "headId", spec = EqualIgnoreCase.class),
            @Spec(path = "base.id", params = "baseId", spec = EqualIgnoreCase.class),
            @Spec(path = "leftArm.id", params = "leftArmId", spec = EqualIgnoreCase.class),
            @Spec(path = "rightArm.id", params = "rightArmId", spec = EqualIgnoreCase.class),
            @Spec(path = "torso.id", params = "torsoId", spec = EqualIgnoreCase.class),

    })
    public interface RobotsSpec extends Specification<Robots> {}
}
