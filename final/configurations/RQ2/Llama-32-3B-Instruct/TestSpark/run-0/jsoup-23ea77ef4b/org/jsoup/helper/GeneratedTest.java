package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testPublicMethod() {
        // Arrange
        String expected = "test";
        String actual = "test";

        // Act
        assertEquals(expected, actual);
    }

    public boolean isPublicMethod() {
        return true;
    }
}

class PublicClass {
    public int multiply(int a, int b) {
        return a * b;
    }

}