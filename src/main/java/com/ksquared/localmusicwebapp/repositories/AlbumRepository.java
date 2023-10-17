package com.ksquared.localmusicwebapp.repositories;

import com.ksquared.localmusicwebapp.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    // You can add custom query methods here if needed
}

