package utils;

import jd2.baggins.pojos.Employer;
import jd2.baggins.pojos.Occupation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-context.xml");

        Occupation occ = (Occupation) appContext.getBean("occupation");
        Occupation occ1 = (Occupation) appContext.getBean("occupation1");
        Occupation occ2 = (Occupation) appContext.getBean("occupation2");
        Employer employer = (Employer) appContext.getBean("employer");
        Employer employer_proto1 = (Employer) appContext.getBean("employer");
        Employer employer_proto2 = (Employer) appContext.getBean("employer");
        Employer employer1 = (Employer) appContext.getBean("employer1");
        Employer employer2 = (Employer) appContext.getBean("employer2");

        employer_proto1.setName("Proto_1");
        employer_proto2.setEmail("ProtoEmail_2");

//        System.out.println("occ = " + occ);
//        System.out.println("occ1 = " + occ1);
//        System.out.println("occ2 = " + occ2);
        System.out.println("employer = " + employer);
        System.out.println("employer_proto1 = " + employer_proto1);
        System.out.println("employer_proto2 = " + employer_proto2);
//        System.out.println("employer1 = " + employer1);
//        System.out.println("employer2 = " + employer2);
    }
}
