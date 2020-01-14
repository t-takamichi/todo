package work.takatanbook.todo.repository.mapper;

import org.apache.ibatis.annotations.*;
import work.takatanbook.todo.entity.TodoEntity;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select * from todo")
    List<TodoEntity> findAll();

    @Select("select * from todo where id = #{id}")
    TodoEntity findByTodoId(Long id);

    @Insert("insert into todo (content, limitDate, checkFlg) values (#{content}, #{limitDate}, #{checkFlg})")
    @Options(useGeneratedKeys = true)
    void save(TodoEntity todoEntity);

}
