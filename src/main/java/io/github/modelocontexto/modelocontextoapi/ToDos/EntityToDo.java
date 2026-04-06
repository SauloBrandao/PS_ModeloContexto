package io.github.modelocontexto.modelocontextoapi.ToDos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ToDo")
@Data
public class EntityToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "FL_Cocluido")
    private Boolean concluido;
}
