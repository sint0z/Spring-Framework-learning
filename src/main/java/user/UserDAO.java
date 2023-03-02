package user;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserDAO {

    @Autowired
    private Repositories repositories;

    private final String name;

    UserDAO(@Value("${user.test}") String test){
        this.name = test;
    }

    @Setter
    @Getter
    @Value("${user.url}")
    private String user_url;

    public String getUserRepository() {
        return repositories.getUser() + " | " +
                repositories.getPassword() +" | " + name;
    }
}
