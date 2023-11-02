package com.app.dtos;

import com.app.enums.Role;

public class RolesDto {
    private int id;
    private Role name;
    private UsersDto user;
    private int role_id;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Role getName() {return name;}
    public void setName(Role name) {this.name = name;}
    public UsersDto getUsers() {return user;}
    public void setUsers(UsersDto user) {this.user = user;}
    public int getRole_id() {return role_id;}
    public void setRole_id(int role_id) {this.role_id = role_id;}

    public RolesDto(){}
    public RolesDto(Role name){
        this.name = name;
    }

}
