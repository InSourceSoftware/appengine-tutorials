package io.insource.tutorials.appengine.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("io.insource.tutorials.appengine.entity")
@EnableJpaRepositories("io.insource.tutorials.appengine.repository")
public class JpaConfiguration {
}
