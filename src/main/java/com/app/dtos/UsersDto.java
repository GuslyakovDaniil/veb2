package com.app.dtos;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UsersDto {
    private int id;
    private Boolean is_active;
    private Date created;
    private String first_name;
    private String image_url;
    private String last_name;
    private Date modified;
    private String email;
    private String password;
    private String username;
    private Integer role_id;
    private OffersDto offers;
    private OffersDto seller_Id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public Boolean getIs_active() {return is_active;}

    public void setIs_active(Boolean is_active) {this.is_active = is_active;}

    public Date getCreated() {return created;}

    public void setCreated(Date created) {this.created = created;}

    public String getFirst_name() {return first_name;}

    public void setFirst_name(String first_name) {this.first_name = first_name;}

    public String getImage_url() {return image_url;}

    public void setImage_url(String image_url) {this.image_url = image_url;}

    public String getLast_name() {return last_name;}

    public void setLast_name(String last_name) {this.last_name = last_name;}

    public Date getModified() {return modified;}

    public void setModified(Date modified) {this.modified = modified;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public Integer getRole_id() {return role_id;}

    public void setRole_id(Integer role_id) {this.role_id = role_id;}

    public OffersDto getOffers() {return offers;}

    public void setOffers(OffersDto offers) {this.offers = offers;}

    public OffersDto getSeller_Id() {return seller_Id;}

    public void setSeller_Id(OffersDto seller_Id) {this.seller_Id = seller_Id;}
    public UsersDto(){}
    public UsersDto(Boolean is_active, String email,Date created, String first_name, String image_url, String last_name,
                    Date modified, String password, String username,Integer role_id){
        this.is_active = is_active;
        this.email = email;
        this.created = created;
        this.first_name = first_name;
        this.image_url = image_url;
        this.last_name = last_name;
        this.modified = modified;
        this.password = password;
        this.username = username;
        this.role_id = role_id;
    }
}

