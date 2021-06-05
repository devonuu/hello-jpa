package jpa_basic.hellojpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item{

    private String name;
    private String isbn;
}
