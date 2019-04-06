package AOP.AOP;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class MyClass {

    @PostConstruct
    void method(){
        System.out.println("original");
        throw new IllegalArgumentException();
    }
}
