package com.buildermarket.backend.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "BUSINESS_PAINTER")
public class BusinessPaintingCompany extends Account {

    @Column(name = "COMPANY_NAME")
    protected String name;

    @Column(name = "CVR")
    protected String cvrNumber;


}
