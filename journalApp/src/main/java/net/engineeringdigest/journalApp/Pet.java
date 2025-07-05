package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//rest APIS builder
public class Pet {

    @Autowired//DI  i.e pet depends on dog
    private Dog myDog;

    @GetMapping("/name")
    public String displayName(){
        return myDog.getName();
    }

}
