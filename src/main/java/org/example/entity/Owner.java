package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.gonger.Gonger;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "owner")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "owner_name")
    @SequenceGenerator(name = "owner",sequenceName = "owner_seq", allocationSize = 1)
   private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private Gonger gonger;
    @OneToMany
    private List<House> houses;
    @OneToMany
    private List<Rent_info> rentInfos;
    @ManyToMany(mappedBy = "owners")
    private List<Agency> agency;
}
