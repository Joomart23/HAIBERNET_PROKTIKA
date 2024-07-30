package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "agancys")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "agansy_name")
    @SequenceGenerator(name = "agansy_name",sequenceName = "agansy_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.PERSIST)
    @ToString.Exclude
    private Address address;
    @ManyToMany
    private List<Owner> owners;

    public Agency(String name, String phoneNumber, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}


