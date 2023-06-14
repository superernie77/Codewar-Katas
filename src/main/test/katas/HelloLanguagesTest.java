package katas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class HelloLanguagesTest {

    @Test
    void testSomething() {
        assertTrue(HelloLanguages.validateHello("hello"));
        assertTrue(HelloLanguages.validateHello("ciao bella!"));
        assertTrue(HelloLanguages.validateHello("salut"));
        assertTrue(HelloLanguages.validateHello("hallo, salut"));
        assertTrue(HelloLanguages.validateHello("hombre! Hola!"));
        assertTrue(HelloLanguages.validateHello("Hallo, wie geht\'s dir?"));
        assertTrue(HelloLanguages.validateHello("AHOJ!"));
        assertTrue(HelloLanguages.validateHello("czesc"));
        assertTrue(HelloLanguages.validateHello("Ahoj"));
        assertFalse(HelloLanguages.validateHello("meh"));
    }
}
