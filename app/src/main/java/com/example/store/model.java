package com.example.store;

public class model {
    private int id_akun;
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public int getId_akun() {
        return id_akun;
    }

    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public model(int id_akun, String firstname, String lastname, String username,String password){
        this.id_akun = id_akun;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;


    }
}
