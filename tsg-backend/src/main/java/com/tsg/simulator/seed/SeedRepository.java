package com.tsg.simulator.seed;

import com.tsg.simulator.nodes.model.SeedNodeMetaDataDto;
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

    @Query("SELECT new com.tsg.simulator.nodes.model.SeedNodeMetaDataDto(seedNode.id, seedNode.nodeKey) FROM SeedNodes seedNode WHERE seedNode.seed.id = :id")
    List<SeedNodeMetaDataDto> findNodes(@Param("id") Long id);
}
