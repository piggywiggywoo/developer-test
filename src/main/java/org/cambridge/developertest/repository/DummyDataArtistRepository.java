package org.cambridge.developertest.repository;

import org.cambridge.developertest.entity.Artist;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a stand in for a REST API or a database. For the purposes of this test
 * this will just provide a way to look up the artist information.
 *
 * Do not modify the crappy code
 */
@Component
public class DummyDataArtistRepository implements ArtistRepository {

    private List<Artist> artists;

    public DummyDataArtistRepository() {
        Artist artist1 = new Artist();
        artist1.setId("artist-001");
        artist1.setName("Ed Sheeran");
        artist1.setSolo(true);

        Artist artist2 = new Artist();
        artist2.setId("artist-002");
        artist2.setName("Beyonce");
        artist2.setSolo(true);

        Artist artist3 = new Artist();
        artist3.setId("artist-003");
        artist3.setName("Paramore");
        artist3.setSolo(false);

        Artist artist4 = new Artist();
        artist4.setId("artist-004");
        artist4.setName("Up Dharma Down");
        artist4.setSolo(false);

        Artist artist5 = new Artist();
        artist5.setId("artist-005");
        artist5.setName("Justin Bieber");
        artist5.setSolo(true);

        Artist artist6 = new Artist();
        artist6.setId("artist-006");
        artist6.setName("BTS");
        artist6.setSolo(false);

        artists = new ArrayList<>();
        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);
        artists.add(artist4);
        artists.add(artist5);
        artists.add(artist6);
    }

    @Override
    public Artist getArtistById(String id) {
        switch (id) {
            case "artist-001":
                return artists.get(0);
            case "artist-002":
                return artists.get(1);
            case "artist-003":
                return artists.get(2);
            case "artist-004":
                return artists.get(3);
            case "artist-005":
                return artists.get(4);
            case "artist-006":
                return artists.get(5);
            default:
                Artist artistUnknown = new Artist();
                artistUnknown.setId("artist-000");
                artistUnknown.setName("Unknown");
                artistUnknown.setSolo(true);
                return artistUnknown;
        }
    }

    @Override
    public Artist getArtistByName(String name) {
        switch (name) {
            case "Ed Sheeran":
                return artists.get(0);
            case "Beyonce":
                return artists.get(1);
            case "Paramore":
                return artists.get(2);
            case "Up Dharma Down":
                return artists.get(3);
            case "Justin Bieber":
                return artists.get(4);
            case "BTS":
                return artists.get(5);
            default:
                Artist artistUnknown = new Artist();
                artistUnknown.setId("artist-000");
                artistUnknown.setName("Unknown");
                artistUnknown.setSolo(true);
                return artistUnknown;
        }
    }
}
