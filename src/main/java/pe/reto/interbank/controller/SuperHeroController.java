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
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pe.reto.interbank.model.Hability;
import pe.reto.interbank.model.SuperHero;
import pe.reto.interbank.model.enums.LevelPower;
import pe.reto.interbank.service.SuperHeroService;

@RequestMapping("/api/superhero")
@RestController
@RequiredArgsConstructor
public class SuperHeroController {
    
    private final SuperHeroService service;

    @GetMapping("/")
    public List<SuperHero> list(){
        return service.list();
    }

    @GetMapping("/{level}")
    public List<SuperHero> listByLevel(@PathVariable LevelPower level){
        return service.listByLevel(level);
    }

    @GetMapping("/hability/{name}")
    public Hability listByHability(@PathVariable String name){
        return service.findByNameHability(name);
    }
    @GetMapping("/name/{name}")
    public List<SuperHero> listByName(@PathVariable String name){
        return service.listByName(name);
    }

    @PostMapping("/")
    public SuperHero create(@RequestBody SuperHero SuperHero){

        SuperHero newSuperHero = service.create(SuperHero);
        return newSuperHero;
    }

    @PutMapping("/{id}")
    public SuperHero edit(@RequestBody SuperHero SuperHero, @PathVariable Integer id){
        SuperHero newhSuperHero = service.edit(SuperHero, id);
        return newhSuperHero;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        service.delete(id);
        return new ResponseEntity("SuperHero deleted", HttpStatus.OK);
    }

}
