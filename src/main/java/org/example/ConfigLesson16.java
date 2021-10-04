package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("org.example")
public class ConfigLesson16 {
    @Bean
    public Account account(){
        return new Account(1,"RUB", LocalDate.of(2021, 1, 1));
    }

    @Bean
    public Account account01(){
        return new Account(2,"RUB", LocalDate.of(2021, 2, 2));
    }

    @Bean
    public Client client(){
        List<Account> accountList = new ArrayList<Account>(Arrays.asList(account(), account01()));
        return new Client((short) 18,"Ivan", accountList);
    }

}
