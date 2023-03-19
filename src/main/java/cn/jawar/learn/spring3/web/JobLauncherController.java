package cn.jawar.learn.spring3.web;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("job")
public class JobLauncherController {

    private final JobLauncher jobLauncher;

    private final Job job;


    @GetMapping
    public void handle(JobParameters jobParameters) throws Exception {
        jobLauncher.run(job, jobParameters);
    }
}