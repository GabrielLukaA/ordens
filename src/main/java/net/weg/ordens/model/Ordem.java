package net.weg.ordens.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ordem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numeroDaOrdem;
    @ManyToOne
    private Solicitante cliente;
    private String descricao;
    private String status;


}
