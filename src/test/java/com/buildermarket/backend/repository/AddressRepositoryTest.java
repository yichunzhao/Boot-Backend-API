package com.buildermarket.backend.repository;

import com.buildermarket.backend.entities.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AddressRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private AddressRepository addressRepository;


    public AddressRepositoryTest() {
    }

    @Test
    public void testTestEntityManager() {
        assertNotNull(testEntityManager);
    }

    @Test
    public void testAddressRepository() {
        assertNotNull(addressRepository);
    }

    @Test
    public void saveGeoCodedAddress() {

        //given
        String geoCodedAddress = "Banebrinken 95, 2400 Copenhagen; Denmark";
        Address address = new Address();
        address.setGeoCodedAddress(geoCodedAddress);
        testEntityManager.persist(address);
        testEntityManager.flush();

        //when
        Address found = addressRepository.findByGeoCodedAddress(geoCodedAddress);

        //then
        assertNotNull(found);

    }
}