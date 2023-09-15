package pe.reto.interbank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.reto.interbank.exceptions.UserNotFoundException;
import pe.reto.interbank.model.Hability;
import pe.reto.interbank.model.SuperHero;
import pe.reto.interbank.model.enums.LevelPower;
import pe.reto.interbank.repository.SuperHeroRepository;

@Service
@RequiredArgsConstructor
public class SuperHeroService {
    
    private final SuperHeroRepository repository;
    
    public List<SuperHero> list(){
        return repository.findByEnabled(true);
    }

    public SuperHero create(SuperHero SuperHero){
        SuperHero.setEnabled(true);
        SuperHero SuperHeronew = repository.save(SuperHero);
        return SuperHeronew;
    }

    public SuperHero edit(SuperHero SuperHero, Integer id){
        SuperHero existing = repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("SuperHero not found"));
        
        existing.setName(SuperHero.getName());
        existing.setLevelPower(SuperHero.getLevelPower());
        existing.setDescription(SuperHero.getDescription());

        return repository.save(existing);
    }


    public void delete(Integer id){
        SuperHero existing = repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("SuperHeroe not found"));

        existing.setEnabled(false);
        repository.save(existing);
    }

    public List<SuperHero>listByLevel(LevelPower level){
        return  repository.findByLevelPower(level);
    }
    public List<SuperHero>listByName(String name){
        return  repository.findByName(name);
    }
    public Hability findByNameHability(String name){
        SuperHero findHero=repository.findByName(name).get(0);
        return findHero.getHability();
    }
}
