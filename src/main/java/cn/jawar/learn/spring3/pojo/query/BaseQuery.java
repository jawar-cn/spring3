package cn.jawar.learn.spring3.pojo.query;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author dongs
 */
@Data
@Accessors(chain = true)
public class BaseQuery {
    protected PageableDTO pageable;
}
