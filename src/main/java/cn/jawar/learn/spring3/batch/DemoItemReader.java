package cn.jawar.learn.spring3.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component

public class DemoItemReader implements ItemReader<LocalDate> {
    @Override
    public LocalDate read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        LocalDate localDate = LocalDate.now().plusDays(1);
        if (localDate.isAfter(LocalDate.of(2023, 4, 1))) {
            return null;
        }
        return localDate;
    }
}
