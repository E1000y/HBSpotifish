package fr.Emilie.poec.Spotifish.entity;

import jakarta.persistence.*;
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
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date birthDAte;
    private Date createdAt;
    private String email;
    private String name;
    private boolean newsletter;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "account_like_playlist",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "playlist")
    )
    private List<Playlist> playlistsLiked = new ArrayList<>();

    @OneToMany(mappedBy = "playlist")
    private List<Playlist> playlistsOwned = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "account_subscription",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "subscription_id")

    )
    private List<AccountSubscription> accountSubscriptions = new ArrayList<>();





}
