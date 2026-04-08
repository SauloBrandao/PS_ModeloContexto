package io.github.modelocontexto.modelocontextoapi.ToDos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {


    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public EntityToDo salvar(EntityToDo novoToDo) {
        return toDoRepository.save(novoToDo);
    }

    public void atualizarStatus(EntityToDo toDo){
        toDoRepository.save(toDo);
    }

    public EntityToDo buscarTodo(Long id){
        return toDoRepository.findById(id).orElse(null);
    }

}
