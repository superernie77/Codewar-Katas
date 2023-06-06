package main.test.katas;

import main.java.katas.CatJump;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CatJumpTest {

    @Test
    @DisplayName("Test case in description")
    void sampleTest() {
        Assertions.assertEquals(2, CatJump.solution(1, 5));
    }
}
