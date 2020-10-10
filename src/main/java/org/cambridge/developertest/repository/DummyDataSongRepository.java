package org.cambridge.developertest.repository;

import org.cambridge.developertest.entity.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a stand in for a REST API or a database. For the purposes of this test
 * this will always return a sample array list of songs.
 * Do not modify the contents of the list.
 */
@Component
public class DummyDataSongRepository implements SongRepository {


    @Override
    public List<Song> getAllSongs() {
        List<Song> songs = new ArrayList<>();

        Song song1 = new Song();
        song1.setId("song-001");
        song1.setTitle("Perfect");
        song1.setArtists(Arrays.asList("artist-001", "artist-002"));
        song1.setGenre("pop");

        Song song2 = new Song();
        song2.setId("song-002");
        song2.setTitle("Hard Times");
        song2.setArtists(Arrays.asList("artist-003"));
        song2.setGenre("punk rock");

        Song song3 = new Song();
        song3.setId("song-003");
        song3.setTitle("Tadhana");
        song3.setArtists(Arrays.asList("artist-004"));
        song3.setGenre("opm");

        Song song4 = new Song();
        song4.setId("song-004");
        song4.setTitle("Irreplaceable");
        song4.setArtists(Arrays.asList("artist-002"));
        song4.setGenre("pop");

        Song song5 = new Song();
        song5.setId("song-005");
        song5.setTitle("I Don't Care");
        song5.setArtists(Arrays.asList("artist-001", "artist-005"));
        song5.setGenre("pop");

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        return songs;
    }
}
