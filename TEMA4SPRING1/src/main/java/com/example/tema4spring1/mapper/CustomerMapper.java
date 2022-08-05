package com.example.tema4spring1.mapper;
import com.example.tema4spring1.dto.CustomerDTO;
import com.example.tema4spring1.model.Customers;
import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO toCustomerDTO(Customers customer);
}