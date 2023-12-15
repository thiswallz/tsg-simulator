package com.tsg.simulator.seed;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api/seed", produces = "application/json")
@RequiredArgsConstructor
public class SeedController {

    @Autowired
    private SeedService seedService;

    @Operation(summary = "Get a seed by its id")
    @GetMapping("/{id}")
    public Optional<Seed> one(@PathVariable Long id) {
        System.out.println("id: " + id);
        Optional<Seed> seed = seedService.findById(id);


        return seed;
    }

    @Operation(summary = "Get all seeds")
    @GetMapping("/")
    public List<Seed> findAllSeeds() {
        return seedService.findAll();
    }
}
