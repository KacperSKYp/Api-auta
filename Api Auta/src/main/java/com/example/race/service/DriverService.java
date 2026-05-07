
package com.example.race.service;

import com.example.race.model.Driver;
import com.example.race.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    private final DriverRepository repo;

    public DriverService(DriverRepository repo) {
        this.repo = repo;
    }

    public List<Driver> getAll() { return repo.findAll(); }
    public Driver getById(Long id) { return repo.findById(id).orElse(null); }
    public Driver save(Driver d) { return repo.save(d); }
    public void delete(Long id) { repo.deleteById(id); }
}
