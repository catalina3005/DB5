package com.example.tema4spring1.mapper;
import com.example.tema4spring1.dto.ProductDTO;
import com.example.tema4spring1.model.Products;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Products product);
}