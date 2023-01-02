package ir.sudoit.springbootgraalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@SpringBootApplication
public class SpringBootGraalvmApplication {

	@GetMapping
    public String get() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGraalvmApplication.class, args);
    }

}
