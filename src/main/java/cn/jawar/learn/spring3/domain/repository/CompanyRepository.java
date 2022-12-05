package cn.jawar.learn.spring3.domain.repository;

import cn.jawar.learn.spring3.domain.entity.CompanyEntity;
import org.springframework.stereotype.Repository;

/**
 * @author dongs
 */
@Repository
public interface CompanyRepository extends BaseRepository<CompanyEntity, Long> {
}
