package com.app.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "brands")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Brands extends BaseEntity {

    @OneToMany(mappedBy = "brand")
    private Set<Models> model;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Models> getModel() {
        return model;
    }

    public void setModel(Set<Models> model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brands() {
    }

}
