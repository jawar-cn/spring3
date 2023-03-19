package cn.jawar.learn.spring3.domain.mapper;

import cn.jawar.learn.spring3.domain.entity.CompanyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

/**
 * @author dongs
 */
@Mapper
public interface CompanyMapper {

    /**
     * find company by code
     *
     * @param code company code
     * @return entity
     */
    @Select("""
            SELECT * FROM company WHERE code like #{code}||'%'
            """)
    Optional<CompanyEntity> findByCode(@Param("code") String code);

}
