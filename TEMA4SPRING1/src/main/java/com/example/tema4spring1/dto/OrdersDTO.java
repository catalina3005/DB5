package com.example.tema4spring1.dto;
import com.example.tema4spring1.model.OrderDetails;
import lombok.Data;


@Data
public class OrdersDTO {
    private Integer id;
    private String status;
    private String comments;
    private OrderDetails orderDetails;
}