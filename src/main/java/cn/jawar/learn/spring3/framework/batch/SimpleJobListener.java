package cn.jawar.learn.spring3.framework.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

@Slf4j
public class SimpleJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        JobExecutionListener.super.beforeJob(jobExecution);
        log.info("beforeJob:{}", jobExecution);
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        JobExecutionListener.super.afterJob(jobExecution);
        log.info("afterJob:{}", jobExecution);

    }
}
