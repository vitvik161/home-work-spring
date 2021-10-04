package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@Component
public class Account {
    private int sum;
    private String currency;
    private LocalDate createDate;

    @Autowired
    public Account(int sum, String currency, LocalDate createDate) {
        this.sum = sum;
        this.currency = currency;
        this.createDate = createDate;
    }

}
