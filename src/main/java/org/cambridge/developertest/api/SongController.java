package org.cambridge.developertest.api;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * Implement some logic around retrieving song information. In this case it has to be exposed as
 * endpoints in an API.
 *
 * Requirements:
 * 1. Use the Artist and Song repositories to retrieve raw data. Pretend there can be more than 5 songs...
 * 2. Implement the below methods, preferably using Java streams (ie lambda)
 * 3. Fill in the "???"
 * 4. Tests in AppTest must pass
 * 5. Bonus points: Handle exceptions you might encounter if this is a real web service
 *
 */
@RestController
@RequestMapping("/song")
public class SongController {


    @RequestMapping(method = GET, value = "???", produces = "application/json")
    public List<String> getArtistSongTitles(String artistName) {

        //???
        return null;

    }

    @RequestMapping(method = GET, value = "???", produces = "application/json")
    public List<String> getAllArtistNames() {

        //???
        return null;
    }

    @RequestMapping(method = GET, value = "???", produces = "application/json")
    public Map<String,Long> getSongCountPerGenre() {

        //???
        return null;

    }


}
