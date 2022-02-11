package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean
    @Scope("prototype")
    public Cat myCat(){
Cat cat=new Cat();
cat.setName("Musia");
cat.setAge(3);
cat.setColor("White");
        return cat;
    }
}
