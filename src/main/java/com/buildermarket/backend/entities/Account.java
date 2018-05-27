package com.buildermarket.backend.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;


@Setter
@Getter
@MappedSuperclass
public abstract class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID_PK")
    protected Long id;

    @Embedded
    protected LoginInfo loginInfo;

    @OneToOne(mappedBy = "account", targetEntity = Address.class)
    protected Address address;

}
