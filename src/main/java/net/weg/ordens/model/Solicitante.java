package net.weg.ordens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Solicitante extends Usuario {

    @OneToMany(mappedBy = "cliente")
    private List<Ordem> ordens;

}
