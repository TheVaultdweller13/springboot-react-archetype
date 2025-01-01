package maven.archetype.services;

import maven.archetype.model.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
    public String print() {
        var helloWorld = new HelloWorld();
        return helloWorld.getHello();
    }
}