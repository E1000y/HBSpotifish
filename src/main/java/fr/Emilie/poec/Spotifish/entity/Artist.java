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
public class Artist {

    private Long id;

    private String name;
    private String email;
    private String password;
    private String urlBanner;
    private String certificate;
    private Date createdAt;
    private List<Album> albums = new ArrayList<>();


}