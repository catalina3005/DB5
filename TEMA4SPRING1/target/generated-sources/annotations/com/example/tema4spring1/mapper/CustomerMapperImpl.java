package com.example.tema4spring1.mapper;

import com.example.tema4spring1.dto.CustomerDTO;
import com.example.tema4spring1.model.Customers;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T20:13:10+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 11.0.14.1 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO toCustomerDTO(Customers customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        return customerDTO;
    }
}
