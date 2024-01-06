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

public class AccountSubscription {
    private Long id;
    private Date effectiveAt;
    private Date finishedAt;

    private Account account;
    private Subscription subscription;

}
