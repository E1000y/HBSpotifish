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

public class Artist {

    private Long id;

    private String name;
    private String email;
    private String password;
    private String urlBanner;
    private String certificate;
    private Date createdAt;


}