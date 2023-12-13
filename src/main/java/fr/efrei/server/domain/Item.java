package fr.efrei.server.domain;
<<<<<<< HEAD
import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
=======

import jakarta.persistence.Id;

public class Item {
    @Id
>>>>>>> ae1689d9fcb8cc53805987097cb372cb1df67288
    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> ae1689d9fcb8cc53805987097cb372cb1df67288
