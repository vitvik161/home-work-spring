package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Data
@Component
public class Client {
    private short age;
    private String name;
    private List<Account> arrayList;
    @Autowired
    public Client(short age, String name, List<Account> arrayList) {
        this.age = age;
        this.name = name;
        this.arrayList = arrayList;
    }
}
