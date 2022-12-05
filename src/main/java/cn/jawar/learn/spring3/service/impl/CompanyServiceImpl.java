package cn.jawar.learn.spring3.service.impl;

import cn.jawar.learn.spring3.domain.mapper.CompanyMapper;
import cn.jawar.learn.spring3.domain.repository.CompanyRepository;
import cn.jawar.learn.spring3.pojo.dto.CompanyDTO;
import cn.jawar.learn.spring3.pojo.query.CompanyQuery;
import cn.jawar.learn.spring3.service.CompanyService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author dongs
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private CompanyRepository companyRepository;

    @Resource
    private CompanyMapper companyMapper;

    @Override
    public Optional<CompanyDTO> findById(Long id) {
        return companyRepository.findById(id).map(v -> {
            CompanyDTO companyDTO = BeanUtils.instantiateClass(CompanyDTO.class);
            BeanUtils.copyProperties(v, companyDTO);
            return companyDTO;
        });
    }

    @Override
    public Optional<CompanyDTO> findByCode(String code) {
        return companyMapper.findByCode(code).map(v -> {
            CompanyDTO companyDTO = BeanUtils.instantiateClass(CompanyDTO.class);
            BeanUtils.copyProperties(v, companyDTO);
            return companyDTO;
        });
    }

    @Override
    public Page<CompanyDTO> findAll(CompanyQuery query) {
        companyMapper.findByCode(query.getCode());


        return companyRepository.findAll(PageRequest.of(query.getPageable().getPage(), query.getPageable().getSize()))
                .map(v -> {
                    CompanyDTO companyDTO = BeanUtils.instantiateClass(CompanyDTO.class);
                    BeanUtils.copyProperties(v, companyDTO);
                    return companyDTO;
                });
    }
}
