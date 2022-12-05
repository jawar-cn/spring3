package cn.jawar.learn.spring3.pojo.query;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dongs
 */
@Data
@Accessors(chain = true)
public class PageableDTO {

    private Integer page;
    private Integer size;

}
