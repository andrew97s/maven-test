package test3;

import com.github.pagehelper.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test1.Test1Service;
import test2.Test2Service;

import java.util.Objects;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class ,args);
        Test1Service.sayHi();
        Test2Service.sayHi();

        System.out.println(Page.class);
        System.out.println("HELLO THERE THIS IS TEST3 APP !!");
    }
}
