package com.tsg.simulator.seed;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tsg.simulator.nodes.SeedNodes;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "seed")
public class Seed implements Serializable {
    private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long id;

    @OneToMany(mappedBy = "seed", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<SeedNodes> seedNodes;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "data", columnDefinition = "json")
    private String data;
}
