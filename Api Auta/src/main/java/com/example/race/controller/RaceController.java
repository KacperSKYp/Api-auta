
package com.example.race.controller;

import com.example.race.model.Race;
import com.example.race.service.RaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/races")
public class RaceController {

    private final RaceService service;

    public RaceController(RaceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Race> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Race getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Race create(@RequestBody Race r) {
        return service.save(r);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
