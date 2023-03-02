package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import user.Repositories;

@Configuration
@ComponentScan("user")
@PropertySource("classpath:user.properties")
public class ConfigUserGetApplication {

    @Bean
    public Repositories rep() {
        int id = 1;
        Repositories rep = new Repositories();
        rep.setUser("Nikita");
        rep.setPassword("qwerty12345");
        rep.setId(id);
        rep.setUrl("https://habr.com/ru/post/490586/");
        return rep;
    }
}
