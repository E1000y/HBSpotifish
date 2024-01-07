package fr.Emilie.poec.Spotifish.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int duration;
    private boolean IsExplicit;

    @ManyToMany
    @JoinTable(
            name="song_playlist",
            joinColumns = @JoinColumn(name ="song_id"),
            inverseJoinColumns = @JoinColumn(name = "playlist_id")
    )
    private List<Playlist> playlists = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "song_album",
            joinColumns =@JoinColumn(name="song_id"),
            inverseJoinColumns = @JoinColumn(name="album_id")
    )
    private List<Album> albums = new ArrayList<>();

}
