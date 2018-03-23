package io.insource.tutorials.appengine;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ApplicationServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        String env = System.getenv("ENVIRONMENT");
        if (env == null) {
            env = "dev";
        }

        builder.profiles(env);
        return builder.sources(Application.class);
    }
}
