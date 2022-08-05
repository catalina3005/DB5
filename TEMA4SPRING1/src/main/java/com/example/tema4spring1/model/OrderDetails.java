package com.example.tema4spring1.model;import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class OrderDetails {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private int quantity;
    @OneToMany
    @NotNull
    private List<Products> productList;

}