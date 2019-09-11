package atmconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
//        ATM atmannotation = new ATM(bank);
//        ATMSimulator atmSimulator = new ATMSimulator(atmannotation);
//        atmSimulator.run();

        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        ATMSimulator atmSimulator = context.getBean(ATMSimulator.class);
        atmSimulator.run();
    }
}
