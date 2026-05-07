
package com.example.race.service;

import com.example.race.model.Race;
import com.example.race.repository.RaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {
    private final RaceRepository repo;

    public RaceService(RaceRepository repo) {
        this.repo = repo;
    }

    public List<Race> getAll() { return repo.findAll(); }
    public Race getById(Long id) { return repo.findById(id).orElse(null); }
    public Race save(Race r) { return repo.save(r); }
    public void delete(Long id) { repo.deleteById(id); }
}
