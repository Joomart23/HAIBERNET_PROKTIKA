package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "rent_infos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rent_info {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "rent_name")
    @SequenceGenerator(name = "rent_name",sequenceName = "rent_seq", allocationSize = 1)
    private Long id;
    private String Name;
    private int phoneNumber;
    private int rent_id;
    private String checkin;
    private String checkout;
    @OneToOne
    private Rent_info rentInfo;

   @ManyToOne
 //          cascade = { CascadeType.PERSIST,
//            CascadeType.MERGE,
//            CascadeType.DETACH,
//            CascadeType.REFRESH,
//            CascadeType.REMOVE})
    private Customer customer;
    @ManyToOne
    private Owner owner;

    public Rent_info(String name, int phoneNumber, String checkin, String checkout) {
        Name = name;
        this.phoneNumber = phoneNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
