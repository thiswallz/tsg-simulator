package com.tsg.simulator.nodes;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/seed-nodes", produces = "application/json")
@RequiredArgsConstructor
public class SeedNodesController {
    @Autowired
    private SeedNodesService seedNodesService;

    @Operation(summary = "Get a seed node by its id")
    @GetMapping("/{id}")
    public Optional<SeedNodes> one(@PathVariable Long id) {
        return seedNodesService.findById(id);
    }
}
