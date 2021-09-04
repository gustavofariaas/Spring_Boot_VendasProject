package study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class MinhaConfiguration {

    /* Esta configuracao Bean vai ser substituida pelo Application.properties

    @Bean (name = "applicationName")
    public String applicationNome(){
        return "Sistema de Vendas";
    }*/

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Codigo rodando em ambiente de Desenvolvimento");
        };
    }
}
