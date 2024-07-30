package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "houses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "houses_name")
    @SequenceGenerator(name = "houses_name",sequenceName = "houses_seq", allocationSize = 1)
    private Long id;
    private String HouseTypeHouseType;
    private  int price;
    private double  rating;
    private String description;
    private int room;
    private boolean furniture;
    @ManyToOne
    private Owner owner;
    @OneToOne
    private Rent_info rentInfo;



}