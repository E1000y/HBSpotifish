package fr.Emilie.poec.Spotifish.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Album {

    private Long id;
    private String name;
    private Date createdAt;

    private Artist artist;

}