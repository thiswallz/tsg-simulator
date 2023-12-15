package com.tsg.simulator.seed;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedService {
    @Autowired
    private SeedRepository repo;

    Optional<Seed> findById(Long id) {
        return repo.findById(id);
    }

    List<Seed> findAll() {
        return repo.findAll();
    }

    Seed save(Seed seed) {
        return repo.save(seed);
    }
}
