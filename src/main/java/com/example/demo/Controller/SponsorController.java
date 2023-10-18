package com.example.demo.Controller;


import com.example.demo.DAO.entities.Sponsor;
import com.example.demo.serviceSponsor.SponsorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/sponsor")
public class SponsorController {
    @Autowired
    private SponsorServiceImp sponsorServices;
    @GetMapping
    public List<Sponsor> getAllSponsorMembers() {
        return sponsorServices.getAllSponsorMembers();
    }

    @GetMapping("/{id}")
    public Sponsor getSponsorById(@PathVariable Integer id) {
        return sponsorServices.getSponsorById(id);
    }

    @PostMapping
    public Sponsor createSponsor(@RequestBody Sponsor sponsor) {
        return sponsorServices.createSponsor(sponsor);
    }

    @PutMapping("/{id}")
    public Sponsor updateSponsor(@PathVariable Integer id, @RequestBody Sponsor sponsor) {
        return sponsorServices.updateSponsor(id, sponsor);
    }

    @DeleteMapping("/{id}")
    public void deleteSponsor(@PathVariable Integer id) {
        sponsorServices.deleteSponsor(id);
    }

}
