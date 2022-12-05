package cn.jawar.learn.spring3.web;

import cn.jawar.learn.spring3.pojo.dto.CompanyDTO;
import cn.jawar.learn.spring3.pojo.query.CompanyQuery;
import cn.jawar.learn.spring3.service.CompanyService;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author dongs
 */
@RestController
@RequestMapping("companies")
public class CompanyController {
    @Resource
    private CompanyService companyService;

    @GetMapping("{id}")
    public Optional<CompanyDTO> findById(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @GetMapping("code/{code}")
    public Optional<CompanyDTO> findByCode(@PathVariable String code) {
        return companyService.findByCode(code);
    }

    @GetMapping
    public Page<CompanyDTO> findAll(@RequestBody CompanyQuery companyQuery) {
        return companyService.findAll(companyQuery);
    }

}
