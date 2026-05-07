
package com.example.race.controller;

import com.example.race.model.Driver;
import com.example.race.service.DriverService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService service;

    public DriverController(DriverService service) {
        this.service = service;
    }

    @GetMapping
    public List<Driver> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Driver getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Driver create(@RequestBody Driver d) {
        return service.save(d);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
