package com.example.tema4spring1.mapper;
import com.example.tema4spring1.dto.OrdersDTO;
import com.example.tema4spring1.model.Orders;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersMapper {
    OrdersDTO toOrdersDTO(Orders order);

}