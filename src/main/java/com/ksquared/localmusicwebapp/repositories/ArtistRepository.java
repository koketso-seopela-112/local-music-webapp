package com.ksquared.localmusicwebapp.repositories;

import com.ksquared.localmusicwebapp.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    // You can add custom query methods here if needed
}

