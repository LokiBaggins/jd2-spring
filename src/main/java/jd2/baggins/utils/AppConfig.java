package jd2.baggins.utils;

import jd2.baggins.pojos.Employer;
import jd2.baggins.pojos.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@Configuration
@ImportResource("classpath://spring-config.xml")
public class AppConfig {

//    @Autowired
//    @Qualifier("employer1")
    public Employer employer1;

    @Bean
    public Occupation occupation() {
        return new Occupation();
    }

    @Bean
    public Employer employer() {
        return new Employer(3, "Employer3", "321654", "work_3@hard.com", 25);
    }


}
