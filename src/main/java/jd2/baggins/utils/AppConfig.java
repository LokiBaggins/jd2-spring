package jd2.baggins.utils;

import jd2.baggins.pojos.Employer;
import jd2.baggins.pojos.Occupation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {

    @Bean
    public Occupation occupation() {
        return new Occupation();
    }

    @Bean
    public Employer employer() {
        return new Employer(3, "Employer3", "321654", "work_3@hard.com", 25);
    }


}
