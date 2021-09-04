package study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    /* Esta maneira estara utilizando o Bean da MinhaConfiguration
    @Autowired
    @Qualifier("applicationName")
    private String applicationNome;*/

    //    Utilizando o application.properties
    @Value("${application.name}")
    private String applicationNome;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationNome;
    }

    public static void main(String args[]){
        SpringApplication.run(VendasApplication.class, args);
    }
}
