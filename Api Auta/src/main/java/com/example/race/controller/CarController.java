
package com.example.race.controller;

import com.example.race.model.Car;
import com.example.race.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return service.save(car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
