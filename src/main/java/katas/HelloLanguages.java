package katas;

import java.util.List;

public class HelloLanguages {
    
    private static final List<String> hellos = List.of("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc");
    
    public static boolean validateHello(String greetings){
        return hellos.stream().anyMatch( s -> greetings.toLowerCase().contains(s));
    }
}
