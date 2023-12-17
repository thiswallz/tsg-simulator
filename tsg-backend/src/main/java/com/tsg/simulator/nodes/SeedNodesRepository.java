package com.tsg.simulator.nodes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeedNodesRepository extends JpaRepository<SeedNodes, Long> {
    @Query("SELECT seed FROM SeedNodes seed WHERE seed.id = :id")
    Optional<SeedNodes> findById(@Param("id") Long id);
}
