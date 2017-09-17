package springbootapp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer /*implements CommandLineRunner */{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return configureApplication(builder);
    }

    public static void main(String[] args) {
        configureApplication(new SpringApplicationBuilder()).run(args);
    }

    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
        return builder
                .properties("spring.config.name:application"
                                                    +",application-log4j"
                                                    +",application-jdbc"
                                                    +",application-mvc"
                                                    +",application-devtools"
                                                    +",messages")
                .bannerMode(Banner.Mode.OFF)
                .sources(SpringbootApplication.class);
    }

}
