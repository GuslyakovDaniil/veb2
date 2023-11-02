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

    @Column(name = "created")
    private Date created;

    @Column(name = "modified")
    private Date modified;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Brands() {
    }

    protected Brands(Date created, Date modified, String name) {
        this.created = created;
        this.modified = modified;
        this.name = name;
    }
}
