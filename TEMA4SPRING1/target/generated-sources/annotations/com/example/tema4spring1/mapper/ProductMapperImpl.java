package com.example.tema4spring1.mapper;

import com.example.tema4spring1.dto.ProductDTO;
import com.example.tema4spring1.model.Products;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T20:13:10+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 11.0.14.1 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toProductDTO(Products product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        return productDTO;
    }
}
