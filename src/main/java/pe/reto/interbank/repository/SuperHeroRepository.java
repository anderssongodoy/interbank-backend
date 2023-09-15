package pe.reto.interbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.reto.interbank.model.SuperHero;
import pe.reto.interbank.model.enums.LevelPower;


public interface SuperHeroRepository extends JpaRepository<SuperHero, Integer>{
    
    List<SuperHero> findByEnabled(Boolean enabled);
    List<SuperHero> findByName(String name);
    List<SuperHero> findByLevelPower(LevelPower levelPower);

}
