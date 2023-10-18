package com.example.demo.serviceSponsor;

import com.example.demo.DAO.entities.Sponsor;
import com.example.demo.DAO.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SponsorServiceImp implements SponsorService{
    @Autowired
    SponsorRepository sponsorRepository;

    @Override
    public List<Sponsor> getAllSponsorMembers() {
        return sponsorRepository.findAll();
    }

    @Override
    public Sponsor getSponsorById(Integer id) {
        return sponsorRepository.findById(id).orElse(null);
    }

    @Override
    public Sponsor createSponsor(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    @Override
    public Sponsor updateSponsor(Integer id, Sponsor sponsor) {
        Sponsor existingSponsor = sponsorRepository.findById(id).orElse(null);
        if (existingSponsor != null) {
            // Mettez à jour les champs nécessaires de l'employé existant avec les nouvelles valeurs
            existingSponsor.setName(sponsor.getName());
            existingSponsor.setContactPerson(sponsor.getContactPerson());
            existingSponsor.setContactEmail(sponsor.getContactEmail());
            existingSponsor.setTelephone(sponsor.getTelephone());
            existingSponsor.setSponsorshipType(sponsor.getSponsorshipType());

            // Enregistrez les modifications dans la base de données
            return sponsorRepository.save(existingSponsor);
        }
        return null;
    }

    @Override
    public void deleteSponsor(Integer id) {
        sponsorRepository.deleteById(id);
    }
}
