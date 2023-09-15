package pe.reto.interbank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.reto.interbank.exceptions.UserNotFoundException;
import pe.reto.interbank.model.Hability;
import pe.reto.interbank.repository.HabilityRepository;

@Service
@RequiredArgsConstructor
public class HabilityService {
    
    private final HabilityRepository repository;
    
    public List<Hability> list(){
        return repository.findByEnabled(true);
    }

    public Hability create(Hability hability){
        hability.setEnabled(true);
        Hability habilitynew = repository.save(hability);
        return habilitynew;
    }

    public Hability edit(Hability hability, Integer id){
        Hability existing = repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Hability not found"));
        
        existing.setName(hability.getName());
        existing.setLevel(hability.getLevel());

        return repository.save(existing);
    }


    public void delete(Integer id){
        Hability existing = repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Hability not found"));

        existing.setEnabled(false);
        repository.save(existing);
    }
}
