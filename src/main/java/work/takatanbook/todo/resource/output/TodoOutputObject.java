package work.takatanbook.todo.resource.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class TodoOutputObject {
    private Integer id;
    private String content;
    private Date limitDate;
    private Integer checkFlg;
    private Date createdDate;
}
