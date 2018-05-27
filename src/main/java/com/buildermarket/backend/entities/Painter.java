package com.buildermarket.backend.entities;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PAINTER")
public class Painter extends Account {

    @Embedded
    protected Name name;

}
