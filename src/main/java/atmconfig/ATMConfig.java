package atmconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {


    @Bean
    public ATMSimulator atmSimulator() { return new ATMSimulator(atm()); }

    @Bean
    public ATM atm() {return new ATM(bank());}

    @Bean
    public Bank bank (){return new Bank(dataSource());}

    @Bean
    public DataSource dataSource(){return new DataSource("customers.txt");}



}
