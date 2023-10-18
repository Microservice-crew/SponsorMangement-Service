package com.example.demo.DAO.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Sponsor implements Serializable{


        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String name;
        private String contactPerson;
        private String contactEmail;
        private String telephone;
        @Enumerated(EnumType.STRING)
        private SponsorshipType  sponsorshipType ;


}
