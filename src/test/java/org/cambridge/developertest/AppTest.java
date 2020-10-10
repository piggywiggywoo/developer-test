package org.cambridge.developertest;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


/**
 * We'll use this to verify if the logic works. You can use the requests made via mockMvc
 * to complete the code for the webservice.
 * And obviously don't modify the tests.
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetSongTitlesByArtistName() throws Exception {
        mockMvc.perform(get("/song/title")
        .param("artist", "Beyonce")
        .contentType("application/json"))
            .andExpect(status().is(200))
            .andExpect(content().json("[\"Perfect\",\"Irreplaceable\"]"));
    }

    @Test
    public void testGetUniqueArtists() throws Exception {
        mockMvc.perform(get("/song/all-artists")
        .contentType("application/json"))
            .andExpect(status().is(200))
            .andExpect(content().json("[\"Ed Sheeran\",\"Beyonce\", \"Paramore\", \"Up Dharma Down\", \"Justin Bieber\"]"));
    }

    @Test
    public void testGetSongCountPerGenre() throws Exception {
        mockMvc.perform(get("/song/count-per-genre")
        .contentType("application/json"))
            .andExpect(status().is(200))
            .andExpect(content().json("{\"pop\": 3, \"punk rock\": 1, \"opm\": 1}"));
    }
}