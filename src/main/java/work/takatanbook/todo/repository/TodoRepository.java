package work.takatanbook.todo.repository;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import work.takatanbook.todo.entity.TodoEntity;
import work.takatanbook.todo.repository.mapper.TodoMapper;
import work.takatanbook.todo.resource.output.TodoOutputObject;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class TodoRepository {

    @NonNull private TodoMapper todoMapper;

    public List<TodoOutputObject> findAll(){
        return todoMapper.findAll()
                .stream()
                .map(TodoEntity::toTodo)
                .collect(Collectors.toList());
    }

}
