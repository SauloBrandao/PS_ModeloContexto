package io.github.modelocontexto.modelocontextoapi.ToDos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<EntityToDo, Long> {



}
