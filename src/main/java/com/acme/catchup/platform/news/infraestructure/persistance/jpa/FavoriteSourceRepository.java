package com.acme.catchup.platform.news.infraestructure.persistance.jpa;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceRepository extends JpaRepository<FavoriteSource, Long> {

    List<FavoriteSource> findAllByNewsApikey(String newsApiKey);
    boolean existsByNewsApikeyAndSourceId(String newsApiKey, String sourceId);

    Optional<FavoriteSource> findByNewsApikeyAndSourceId(String newsApiKey, String sourceId);

}
