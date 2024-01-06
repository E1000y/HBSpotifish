package fr.Emilie.poec.Spotifish.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Playlist {
    private Long id;
    private String name;
    private Date createdAt;
    private Date updatedAt;


    private List<Account> accounts;
    private Account account;

    private List<Song> songs ;
}
