package fr.Emilie.poec.Spotifish.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Album {

    private Long id;
    private String name;
    private Date createdAt;

    private Artist artist;

    private
    List<Song> songs = new ArrayList<>();


}