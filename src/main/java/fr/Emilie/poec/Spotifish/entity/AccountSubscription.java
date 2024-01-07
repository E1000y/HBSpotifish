package fr.Emilie.poec.Spotifish.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class AccountSubscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date effectiveAt;
    private Date finishedAt;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Subscription subscription;

}
