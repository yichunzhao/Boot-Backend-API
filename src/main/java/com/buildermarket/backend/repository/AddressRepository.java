package com.buildermarket.backend.repository;


import com.buildermarket.backend.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

interface AddressRepository extends JpaRepository<Address, Long> {

}
