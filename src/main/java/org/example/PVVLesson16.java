package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PVVLesson16 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Account accountBean = context.getBean("accountBean",Account.class);
        Account accountBean1 = context.getBean("accountBean01",Account.class);
        Client clientBean = context.getBean("clientBean",Client.class);

        System.out.println(clientBean);
        context.close();

        AnnotationConfigApplicationContext contextA = new AnnotationConfigApplicationContext("org.example");
        Client clientBeanA = contextA.getBean("client",Client.class);
        System.out.println(clientBeanA);
    }
}
