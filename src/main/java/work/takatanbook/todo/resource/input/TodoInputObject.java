package work.takatanbook.todo.resource.input;

import lombok.Data;

import java.util.Date;

@Data
public class TodoInputObject {
    private Integer id;
    private String content;
    private Date limitDate;
    private Integer checkFlg;
}
