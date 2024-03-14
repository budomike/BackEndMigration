package com.example.demo.bootstrap;

import com.example.demo.dao.*;
import com.example.demo.entity.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run (String... args) throws Exception {

    if (customerRepository.count() == 1) {
        Customer customer1 = new Customer();
        Division division1 = divisionRepository.findById(2L).orElse(null);
        customer1.setAddress("333 King St");
        customer1.setPhone("8480103993");
        customer1.setFirstName("Ethan");
        customer1.setLastName("Hawke");
        customer1.setPostal_code("47263");
        customer1.setDivision(division1);
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        Division division2 = divisionRepository.findById(62L).orElse(null);
        customer2.setId(3L);
        customer2.setAddress("594 Finch Ave");
        customer2.setPhone("1139573883");
        customer2.setFirstName("Thomas");
        customer2.setLastName("Lennon");
        customer2.setPostal_code("55476");
        customer2.setDivision(division2);
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        Division division3 = divisionRepository.findById(103L).orElse(null);
        customer3.setId(4L);
        customer3.setAddress("1160 York St");
        customer3.setPhone("6808491999");
        customer3.setFirstName("Nick");
        customer3.setLastName("Swardson");
        customer3.setPostal_code("01774");
        customer3.setDivision(division3);
        customerRepository.save(customer3);

        Customer customer4 = new Customer();
        Division division4 = divisionRepository.findById(25L).orElse(null);
        customer4.setId(5L);
        customer4.setAddress("90 Yonge St");
        customer4.setPhone("4167384346");
        customer4.setFirstName("Kerri");
        customer4.setLastName("Silver");
        customer4.setPostal_code("58137");
        customer4.setDivision(division4);
        customerRepository.save(customer4);

        Customer customer5 = new Customer();
        Division division5 = divisionRepository.findById(66L).orElse(null);
        customer5.setId(6L);
        customer5.setAddress("167 Huron St");
        customer5.setPhone("1823192489");
        customer5.setFirstName("Niecy");
        customer5.setLastName("Nash");
        customer5.setPostal_code("66738");
        customer5.setDivision(division5);
        customerRepository.save(customer5);
    }

    }
}
