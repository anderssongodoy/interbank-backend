// package pe.reto.interbank.controller;

// import java.util.List;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import lombok.RequiredArgsConstructor;
// import pe.reto.interbank.model.SuperHero_hability;
// import pe.reto.interbank.service.SuperHero_habilityService;

// @RestController
// @RequestMapping("/api/superhero-hability")
// @RequiredArgsConstructor
// public class SuperHero_habilityController {
    
//     private final SuperHero_habilityService service;

//     @GetMapping("/")
//     public List<SuperHero_hability> list(){
//         return service.list();
//     }

//     // @PostMapping("/")
//     // public SuperHero_hability create(@RequestBody SuperHero_hability SuperHero_hability){

//     //     SuperHero_hability newSuperHero_hability = service.create(SuperHero_hability);
//     //     return newSuperHero_hability;
//     // }
// }
