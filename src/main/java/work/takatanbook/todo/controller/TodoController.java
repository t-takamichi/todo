package work.takatanbook.todo.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.takatanbook.todo.resource.output.TodoOutputObject;
import work.takatanbook.todo.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

    @NonNull private TodoService todoService;


    @RequestMapping("/list")
    public List<TodoOutputObject> index(){
        return todoService.getTodoAll();
    }
}
