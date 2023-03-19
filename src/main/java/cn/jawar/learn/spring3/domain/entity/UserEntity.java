package cn.jawar.learn.spring3.domain.entity;

import cn.jawar.learn.spring3.common.enums.GenderEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

/**
 * @author dongs
 */
@Data
@Table("user")
public class UserEntity {

    @Id
    private Long id;

    private String name;

    @MappedCollection(idColumn = "id", keyColumn = "company_id")
    private List<CompanyEntity> company;

    private GenderEnum gender;
}
