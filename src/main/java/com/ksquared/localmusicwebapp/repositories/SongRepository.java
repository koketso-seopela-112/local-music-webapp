package com.ksquared.localmusicwebapp.repositories;

import com.ksquared.localmusicwebapp.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    // You can add custom query methods here if needed
}

