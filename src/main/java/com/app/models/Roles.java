package com.app.models;

import com.app.enums.Role;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "roles")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Roles extends BaseEntity {
    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private Role name;

    public Role getName() {return name;}

    public void setName(Role name) {this.name = name;}

    @OneToMany(mappedBy = "role")
    private Set<Users> user;

    public Set<Users> getUser() {
        return user;
    }

    public void setUser(Set<Users> user) {
        this.user = user;
    }



    protected Roles() {
    }

}
