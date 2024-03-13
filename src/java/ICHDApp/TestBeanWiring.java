package ICHDApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin-Tomiloba Olowo
 */
public class TestBeanWiring {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ICHDApp/Spring-Config.xml");
        
        Customer customer = (Customer) ac.getBean("CustomerBean");
        System.out.println("The values are : ");
        System.out.println(customer.getFirstName()+"." + customer.getMiddleName()+"." +customer.getLastName());
        System.out.println(customer.getMiddleName());
        System.out.println(customer.getLastName());

    }
    
}
