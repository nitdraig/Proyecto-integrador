package com.draig2.draig2.services;

import com.draig2.draig2.models.About;
import com.draig2.draig2.models.Educacion;
import com.draig2.draig2.repository.AboutRepo;
import com.draig2.draig2.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AboutService {
    private final AboutRepo aboutRepo;

    @Autowired
    public AboutService(AboutRepo aboutRepo) {
        this.aboutRepo = aboutRepo;
    }
    public About addAbout (About about){
        return aboutRepo.save(about);

    }

    public List<About> buscarAbout() {
        return aboutRepo.findAll();

    }
    public About editarAbout (About about){
        return aboutRepo.save(about);
    }
    public void borrarAbout(Long id){
        aboutRepo.deleteById(id);
    }
}
