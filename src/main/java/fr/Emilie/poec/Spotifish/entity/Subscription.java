package fr.Emilie.poec.Spotifish.entity;


import jakarta.persistence.Entity;
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
public class Subscription {

    private Long id;
    private String name;
    private Double cost;
    private List<AccountSubscription> accountSubscriptions = new ArrayList<>();

}
