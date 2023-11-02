package com.app.enums;

public enum Role {
    USER("Пользователь"),ADMIN("Админ");
    private String tranfer;

    Role(String tranfer){
        this.tranfer = tranfer;
    }
    public String toString(){
        return "" + tranfer;
    }
}
