package org.cambridge.developertest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Song {

    private String id;
    private String title;
    private List<String> artists;
    String genre;
}
