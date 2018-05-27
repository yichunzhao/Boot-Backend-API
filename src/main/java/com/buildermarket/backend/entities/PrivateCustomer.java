package com.buildermarket.backend.entities;

import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PRIVATE_CUSTOMER")
public class PrivateCustomer extends Account {

    @Embedded
    protected Name name;

}
