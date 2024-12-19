package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseName_ThrowsExceptionWhenInvalidString {

    @Test
    public void testParseName_ThrowsExceptionWhenInvalidString() {
        // Arrange
        String expected = "1234567890abcdef";
        Mockito.when(AppVersion.parseName(expected)).thenAnswer(new Answer<>() {
            @Override
            public Object get() throws Exception {
                return new AppVersion();
            }
        });

        try {
            AppVersion.parseName(expected);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            // Expected
        }
    }

}