package com.example.foodapi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@Setter
@Document(collection = "foods")
public class Food {
    @Id
    private int id;
    private String foodName;
    private String restaurantName;
    private int price;

    public Food(){

    }
}
