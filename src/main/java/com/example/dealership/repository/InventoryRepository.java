package com.example.dealership.repository;

import com.example.dealership.model.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InventoryRepository extends CrudRepository<Inventory, Integer> {
    List<Inventory> findByModel(String carModel);
    List<Inventory> findByMake(String carMake);

}
