package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_name")
    @SequenceGenerator(name = "address_name", sequenceName = "address_seq", allocationSize = 1)
    private Long id;
    private String city;
    private String region;
    private String street;
    @OneToOne(mappedBy = "address")
    @ToString.Exclude
    private Agency agency;
    @OneToOne
    private House house;
    public Address(String city, String region, String street) {
        this.city = city;
        this.region = region;
        this.street = street;

    }
}


