package jd2.baggins.utils;

public class AspectLogger {

    public void before() {
        System.out.println("Before method");
    }

    public void after() {
        System.out.println("After method");
    }

    public void around() {
        System.out.println("After method");
    }
}
