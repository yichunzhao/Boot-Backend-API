package com.buildermarket.backend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class GPSCoordinate {

    @Column(name = "LATITUDE")
    protected Double latitude;

    @Column(name = "LONGITUDE")
    protected Double longitude;
}
