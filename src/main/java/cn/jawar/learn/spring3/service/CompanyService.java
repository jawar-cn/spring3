package cn.jawar.learn.spring3.service;


import cn.jawar.learn.spring3.pojo.dto.CompanyDTO;
import cn.jawar.learn.spring3.pojo.query.CompanyQuery;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * @author dongs
 */
public interface CompanyService extends BaseService<CompanyDTO> {


    Optional<CompanyDTO> findByCode(String code);

    Page<CompanyDTO> findAll(CompanyQuery query);
}
