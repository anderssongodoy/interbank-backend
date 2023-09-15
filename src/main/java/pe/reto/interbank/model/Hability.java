package pe.reto.interbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.reto.interbank.model.enums.LevelPower;

@Data
@Entity
@Table( name = "hability")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Boolean enabled = true;
    @Enumerated(EnumType.STRING)
    private LevelPower level;
    
}
