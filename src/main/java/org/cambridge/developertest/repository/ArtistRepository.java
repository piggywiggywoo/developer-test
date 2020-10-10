package org.cambridge.developertest.repository;

import org.cambridge.developertest.entity.Artist;

public interface ArtistRepository {

    public Artist getArtistById(String id);
    public Artist getArtistByName(String name);
}
