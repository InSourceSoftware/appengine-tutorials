package io.insource.tutorials.appengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);

        String env = System.getenv("ENVIRONMENT");
        if (env == null) {
            env = "dev";
        }

        springApplication.setAdditionalProfiles(env);
        springApplication.run(args);
    }
}
