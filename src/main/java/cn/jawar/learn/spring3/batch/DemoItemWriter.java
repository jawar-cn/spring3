package cn.jawar.learn.spring3.batch;

import cn.jawar.learn.spring3.domain.entity.CompanyEntity;
import cn.jawar.learn.spring3.domain.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class DemoItemWriter implements ItemWriter<String> {
    private final CompanyRepository companyRepository;

    @Override
    public void write(Chunk<? extends String> chunk) throws Exception {
        List<CompanyEntity> companyEntities = chunk.getItems().stream().map(it -> {
            var company = new CompanyEntity();
            company.setCode(it);
            company.setName(it);
            return company;
        }).toList();
        companyRepository.saveAll(companyEntities);
    }
}
