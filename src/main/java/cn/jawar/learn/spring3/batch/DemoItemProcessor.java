package cn.jawar.learn.spring3.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DemoItemProcessor implements ItemProcessor<LocalDate, String> {
    @Override
    public String process(LocalDate localDate) throws Exception {
        return localDate.toString();
    }
}
