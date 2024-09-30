package com.hvt.rest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contact")
class Contact{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cID;
    private String name;
    private String work;
    private String email;
    private String phone;

}
