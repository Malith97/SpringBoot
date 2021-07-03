package com.example.foodapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodController {

    @Autowired
    public FoodRepository repository;


    @PostMapping("/addFood")
    public String saveFood(@RequestBody Food food){
        Food insertFood = repository.insert(food);
        return "Food Added with ID :" + insertFood.getId();
    }

    @GetMapping("/findAllFoods")
    public List<Food> getFoods(){
        return repository.findAll();
    }

    @GetMapping("/findAllFoods/{id}")
    public Optional<Food> getFood(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFood(@PathVariable int id){
        repository.deleteById(id);
        return "Deleted Food with ID :" +id;
    }


}
