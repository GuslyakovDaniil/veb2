package com.app.models;

import com.app.enums.Engine;
import com.app.enums.Transmission;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "offers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Offers extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "seller_Id")
    private Users seller;
    @OneToOne
    @JoinColumn(name = "model_Id")
    private Models model;

    @Column(name = "description")
    private String description;
    @Column(name = "engine")
    private Engine engine;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "price", precision = 19, scale = 2)
    private BigDecimal price;
    @Column(name = "transmission")
    private Transmission transmission;
    @Column(name = "year")
    private Integer year;

    public Offers() {
    }

    public Models getModel() {
        return model;
    }

    public void setModel(Models model) {
        this.model = model;
    }

    public Users getSeller() {
        return seller;
    }

    public void setSeller(Users seller) {
        this.seller = seller;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @PrePersist
    public void prePersist() {
        Date currentDate = new Date();
        this.created = currentDate;
        this.modified = currentDate;
    }

    @PreUpdate
    public void preUpdate() {
        this.modified = new Date();
    }

}
