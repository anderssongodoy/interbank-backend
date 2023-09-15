package pe.reto.interbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.reto.interbank.model.enums.LevelPower;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="superHero")
public class SuperHero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private LevelPower levelPower;

    private Boolean enabled = true;

     @ManyToOne
     @JoinColumn(name = "hability", nullable = false)
     private Hability  hability;

    // @OneToMany(targetEntity = Hability.class,cascade = CascadeType.ALL)
    // @JoinColumn(name = "id", referencedColumnName = "id")
    // private List<Hability> habilityList;

}
