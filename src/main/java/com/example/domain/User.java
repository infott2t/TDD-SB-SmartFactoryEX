package com.example.domain;

public class User {
    private Long id;
    private String abcId;
    private String userRole;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String addressDetail;
    private String addressPostCode;





    public User(Long id, String userRole, String name, String email, String phone, String address, String addressDetail, String addressPostCode) {
        this.id = id;
        this.userRole = userRole;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.addressDetail = addressDetail;
        this.addressPostCode = addressPostCode;
    }
}
