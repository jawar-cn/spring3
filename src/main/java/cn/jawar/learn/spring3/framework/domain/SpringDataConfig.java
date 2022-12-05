package cn.jawar.learn.spring3.framework.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 * @author dongs
 */
@Configuration
@EnableJdbcRepositories(basePackages = "cn.jawar.learn.spring3.domain")
@EnableJdbcAuditing
public class SpringDataConfig {

}


