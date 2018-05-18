package com.buildermarket.backend.entities;

import com.buildermarket.backend.domainmodel.Roles;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_ROLES")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID_PK")
    protected Long id;

    @Column(name = "ROLE_TYPE")
    @Enumerated(EnumType.ORDINAL)
    protected Roles role;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID_FK", referencedColumnName = "ACCOUNT_ID_PK")
    protected Account account;


}
