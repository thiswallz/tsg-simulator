package com.tsg.simulator.seed;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "seed")
public class Seed implements Serializable {
    private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "creation_time")
    private LocalDateTime creationTime;
}
