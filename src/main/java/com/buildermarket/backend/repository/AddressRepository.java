package com.buildermarket.backend.repository;


import com.buildermarket.backend.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByGeoCodedAddress(String geoCodedAddress);

}
