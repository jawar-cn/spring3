package cn.jawar.learn.spring3.pojo.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author dongs
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CompanyQuery extends BaseQuery {
    private String code;
}
