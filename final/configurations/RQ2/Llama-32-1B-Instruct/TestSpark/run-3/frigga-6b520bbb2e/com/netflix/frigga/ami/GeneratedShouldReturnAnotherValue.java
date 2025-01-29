package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldReturnAnotherValue {

    public String getPublicClass() {
        return "This is the public class";
    }

    public int getPublicMethod() {
        return 42;
    }
}

class GeneratedTest {

    @Test
    public void shouldReturnAnotherValue() {
        // Given
        String result = MyService.getPublicMethod().toString();

        // When
        Object methodResult = result;

        // Then
        assertEquals("42", methodResult.toString());
    }

}