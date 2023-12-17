package com.tsg.simulator.nodes;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tsg.simulator.seed.Seed;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "seed_nodes")
public class SeedNodes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seed_id")
    @JsonIgnore
    private Seed seed;

    @Column(name = "node_key")
    private String nodeKey;

    @Column(name = "node_data", columnDefinition = "json")
    private String nodeData;
}
