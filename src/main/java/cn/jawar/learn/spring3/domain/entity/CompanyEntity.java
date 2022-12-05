package cn.jawar.learn.spring3.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author dongs
 */
@Data
@Table("company")
public class CompanyEntity {

    @Id
    private Long id;
    private String code;
    private String name;

}
