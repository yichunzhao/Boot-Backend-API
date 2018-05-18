package com.buildermarket.backend.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_PK")
    protected Long id;

    @Column(name = "GEO_CODED_ADDRESS")
    protected String geoCodedAddress;

    @Embedded
    protected GPSCoordinate gpsCoordinate;

    @OneToOne
    @JoinColumn(referencedColumnName = "ACCOUNT_ID_PK", name = "ACCOUNT_ID_FK")
    protected Account account;

}
