package fr.Emilie.poec.Spotifish.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Account implements {
    private Long id;
    private Date birthDAte;
    private Date createdAt;
    private String email;
    private String name;
    private boolean newsletter;
    private String password;

    private List<Playlist> playlistsLiked = new ArrayList<>();

    private List<Playlist> playlistsOwned = new ArrayList<>();
    private List<AccountSubscription> accountSubscriptions = new ArrayList<>();





}
