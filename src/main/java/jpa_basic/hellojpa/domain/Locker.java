package jpa_basic.hellojpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Locker {

    @Id @GeneratedValue
    @Column(name = "locker_id")
    private Long id;

    private String name;
}
