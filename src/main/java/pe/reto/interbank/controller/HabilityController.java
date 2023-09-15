package pe.reto.interbank.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pe.reto.interbank.model.Hability;
import pe.reto.interbank.service.HabilityService;

@RestController
@RequestMapping("/api/hability")
@RequiredArgsConstructor
public class HabilityController {
    
    private final HabilityService service;

    @GetMapping("/")
    public List<Hability> list(){
        return service.list();
    }

    @PostMapping("/")
    public Hability create(@RequestBody Hability hability){

        Hability newHability = service.create(hability);
        return newHability;
    }

    @PutMapping("/{id}")
    public Hability edit(@RequestBody Hability hability, @PathVariable Integer id){
        Hability newhHability = service.edit(hability, id);
        return newhHability;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        service.delete(id);
        return new ResponseEntity("Hability deleted", HttpStatus.OK);
    }

}
