package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldReturnSomeValue {

    public String getPublicClass() {
        return "This is the public class";
    }

    public int getPublicMethod() {
        return 42;
    }
}

class GeneratedTest {

    @Test
    public void shouldReturnSomeValue() {
        // Given
        String result = MyService.getPublicClass();

        // When
        int value = Integer.parseInt(result);

        // Then
        assertEquals(42, value);
    }

}