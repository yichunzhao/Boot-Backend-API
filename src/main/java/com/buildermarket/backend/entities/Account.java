package com.buildermarket.backend.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID_PK")
    protected Long id;

    @Embedded
    protected LoginInfo loginInfo;

    @OneToOne(mappedBy = "account", targetEntity = Address.class)
    protected Address address;

}
