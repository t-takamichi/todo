package work.takatanbook.todo.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import work.takatanbook.todo.repository.TodoRepository;
import work.takatanbook.todo.resource.output.TodoOutputObject;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    @NonNull private TodoRepository todoRepository;

    public List<TodoOutputObject> getTodoAll(){
        return todoRepository.findAll();
    }
}
