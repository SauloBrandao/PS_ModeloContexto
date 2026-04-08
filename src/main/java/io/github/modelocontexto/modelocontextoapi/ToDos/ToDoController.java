package io.github.modelocontexto.modelocontextoapi.ToDos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ToDo")
public class ToDoController {

    private ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @PostMapping
    public EntityToDo savar(@RequestBody EntityToDo toDo) {
        return service.salvar(toDo);
    }

    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Long id, @RequestBody EntityToDo novoToDo) {
        novoToDo.setId(id);
        service.atualizarStatus(novoToDo);
    }

    @GetMapping("{id}")
    public EntityToDo buscar(@PathVariable("id") Long id) {
        return service.buscarTodo(id);
    }
}
