package jd2.baggins.utils;

<<<<<<< HEAD:src/main/java/jd2/baggins/utils/Launcher.java
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jd2.baggins.pojos.Occupation;

public class Launcher {
=======
import jd2.baggins.pojos.Employer;
import jd2.baggins.pojos.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Launcher {
    @Autowired
    @Qualifier("employer1")
    public Employer employer;
>>>>>>> 1587b281f6fbf1bc7e848622debc287fd363a04b:src/main/java/jd2/baggins/utils/Launcher.java


    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-context.xml");
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        Occupation occ = new Launcher().occupation;
        Occupation occ = (Occupation) appContext.getBean("occupation");
//        Occupation occ = appContext.getBean(Occupation.class);
//        Occupation occ1 = (Occupation) appContext.getBean("occupation1");
//        Occupation occ2 = (Occupation) appContext.getBean("occupation2");
//        Employer employer = (Employer) appContext.getBean("employer");
//        Employer employer_proto1 = (Employer) appContext.getBean("employer");
//        Employer employer_proto2 = (Employer) appContext.getBean("employer");
//        Employer employer1 = (Employer) appContext.getBean("employer1");
//        Employer employer2 = (Employer) appContext.getBean("employer2");

//        employer_proto1.setName("Proto_1");
//        employer_proto2.setEmail("ProtoEmail_2");




        System.out.println("occ = " + occ);
//        System.out.println("occ1 = " + occ1);
        System.out.println("occ.getEmployer() = " + occ.getEmployer());

//        System.out.println("employer = " + employer);
    }
}
