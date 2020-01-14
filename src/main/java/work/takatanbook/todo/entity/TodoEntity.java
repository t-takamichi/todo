package work.takatanbook.todo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import work.takatanbook.todo.resource.output.TodoOutputObject;

import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class TodoEntity {
    private Integer id;
    private String content;
    private Date limitDate;
    private Integer checkFlg;
    private Date createdDate;
    public TodoOutputObject toTodo(){
        return TodoOutputObject.builder()
                .id(this.id)
                .content(this.content)
                .limitDate(this.limitDate)
                .checkFlg(this.checkFlg)
                .createdDate(this.createdDate)
                .build();
    }
}
