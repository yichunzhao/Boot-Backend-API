package com.buildermarket.backend.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@Embeddable
public class LoginInfo {

    @Column(name = "LOGIN_NAME")
    protected String email;

    @Column(name = "PASSWORD")
    protected String password;

    @OneToMany(mappedBy = "account", targetEntity = Role.class)
    protected Set<Role> roles = new HashSet<>();
}
