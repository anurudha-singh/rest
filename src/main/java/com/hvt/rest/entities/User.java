package com.hvt.rest.entities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String name;
    private String email;
    public User(int iD, String name, String email, String about, Contact contact) {
        ID = iD;
        this.name = name;
        this.email = email;
        this.about = about;
        this.contact = contact;
    }

    public User() {
        //TODO Auto-generated constructor stub
    }

    private String about;

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @OneToOne(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.LAZY)// This means that the owning side is Contact table and the extraa column will be added under the contact table
    private Contact contact;
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAbout() {
        return about;
    }

    public Contact getContact() {
        return contact;
    }
    
}
