package com.example.tema4spring1.mapper;

import com.example.tema4spring1.dto.OrdersDTO;
import com.example.tema4spring1.model.Orders;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T20:13:10+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 11.0.14.1 (Eclipse Adoptium)"
)
@Component
public class OrdersMapperImpl implements OrdersMapper {

    @Override
    public OrdersDTO toOrdersDTO(Orders order) {
        if ( order == null ) {
            return null;
        }

        OrdersDTO ordersDTO = new OrdersDTO();

        return ordersDTO;
    }
}
