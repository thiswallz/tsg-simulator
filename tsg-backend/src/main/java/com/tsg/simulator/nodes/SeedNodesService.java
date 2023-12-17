package com.tsg.simulator.nodes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedNodesService {
    @Autowired
    private SeedNodesRepository repo;

    Optional<SeedNodes> findById(Long id) {
        return repo.findById(id);
    }

    List<SeedNodes> findAll() {
        return repo.findAll();
    }

    SeedNodes save(SeedNodes seed) {
        return repo.save(seed);
    }
}
