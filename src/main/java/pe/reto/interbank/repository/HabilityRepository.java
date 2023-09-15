package pe.reto.interbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.reto.interbank.model.Hability;
import pe.reto.interbank.model.enums.LevelPower;

public interface HabilityRepository extends JpaRepository<Hability, Integer> {
    
    List<Hability>  findByLevel(LevelPower levelPower);

    List<Hability> findByEnabled(Boolean enabled);
}
