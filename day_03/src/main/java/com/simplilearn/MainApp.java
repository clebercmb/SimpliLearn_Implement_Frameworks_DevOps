package com.simplilearn;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");

        obj.setMessage("Set from Object1");
        obj.getMessage();

        obj2.setMessage("Set from Object2");
        obj2.getMessage();

        obj.getMessage();

        //SpringApplication.run(MainApp.class, args);
    }

}