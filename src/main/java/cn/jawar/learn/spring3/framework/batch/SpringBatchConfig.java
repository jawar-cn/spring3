package cn.jawar.learn.spring3.framework.batch;

import cn.jawar.learn.spring3.batch.DemoItemProcessor;
import cn.jawar.learn.spring3.batch.DemoItemReader;
import cn.jawar.learn.spring3.batch.DemoItemWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import java.time.LocalDate;
import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class SpringBatchConfig {
    private final DemoItemReader itemReader;
    private final DemoItemWriter itemWriter;
    private final DemoItemProcessor itemProcessor;

    @Bean
    public Job demo(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        String jobName = Arrays.stream(Thread.currentThread().getStackTrace()).findFirst().map(StackTraceElement::getMethodName).orElse("job");
        return new JobBuilder(jobName, jobRepository)
                .start(sampleStep(jobRepository, transactionManager))
                .listener(jobExecutionListener())
                .build();
    }


    /**
     * Note the TransactionManager is typically autowired in and not needed to be explicitly
     * configured
     */
    @Bean
    public Step sampleStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        String stepName = Arrays.stream(Thread.currentThread().getStackTrace()).findFirst().map(StackTraceElement::getMethodName).orElse("job");
        return new StepBuilder(stepName, jobRepository)
                .<LocalDate, String>chunk(3, transactionManager)
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
    }

    @Bean
    public JobExecutionListener jobExecutionListener() {
        return new SimpleJobListener();
    }

}
