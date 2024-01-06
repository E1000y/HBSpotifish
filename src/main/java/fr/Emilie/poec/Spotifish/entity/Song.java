package fr.Emilie.poec.Spotifish.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Song {
    private Long id;
    private String name;
    private int duration;
    private boolean IsExplicit;

    private List<Album> albums;

}
