package fr.efrei.server.domain;
import jakarta.persistence.*;
@SequenceGenerator(
        name = "sequenceGenerator",
        sequenceName = "SEQUENCE_ITEM",
        allocationSize = 1)
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
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
}
