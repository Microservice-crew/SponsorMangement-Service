package com.example.demo.serviceSponsor;

import com.example.demo.DAO.entities.Sponsor;

import java.util.List;

public interface SponsorService {
    List<Sponsor> getAllSponsorMembers();
    Sponsor getSponsorById(Integer id);
    Sponsor createSponsor(Sponsor sponsor);
    Sponsor updateSponsor(Integer id, Sponsor sponsor);
    void deleteSponsor(Integer id);
}
