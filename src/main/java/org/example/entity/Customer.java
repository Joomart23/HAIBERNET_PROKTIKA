package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.gonger.Gonger;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_name")
    @SequenceGenerator(name = "customer_name", sequenceName = "customers_seq", allocationSize = 1)
    private Long id;
    private String firsName;
    private String lastName;
    private String email;
    private LocalDate daeOfBirth;
    private Gonger gonger;
    private String nationality;
    private String FamilyStatusFamilyStatus;
   @OneToMany(mappedBy = "customer")
           //,cascade = {
//            CascadeType.PERSIST,
//            CascadeType.MERGE,
//            CascadeType.DETACH,
//            CascadeType.REFRESH,
//            CascadeType.REMOVE})

    private List<Rent_info> rentInfos;

   public Customer(String firsName, String lastName, String email, LocalDate daeOfBirth, Gonger gonger, String nationality,List<Rent_info> rentInfos) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.daeOfBirth = daeOfBirth;
        this.gonger = gonger;
        this.nationality = nationality;
//        this.FamilyStatusFamilyStatus = familyStatusFamilyStatus;
        this.rentInfos = rentInfos;
    }
}
