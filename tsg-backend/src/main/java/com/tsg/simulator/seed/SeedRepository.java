package com.tsg.simulator.seed;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeedRepository extends JpaRepository<Seed, Long> {
    @Query("SELECT seed FROM Seed seed WHERE seed.id = :id")
    Optional<Seed> findById(@Param("id") Long id);
}
