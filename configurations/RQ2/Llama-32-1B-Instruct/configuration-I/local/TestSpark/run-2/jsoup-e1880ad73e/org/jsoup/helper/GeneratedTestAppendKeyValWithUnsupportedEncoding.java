package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedTestAppendKeyValWithUnsupportedEncoding {

    @Test
    public void testAppendKeyValWithUnsupportedEncoding() throws Exception {
        // Arrange
        int value = 10;
        char[] expected = {'H', 'e', 'l', 'l', 'o'};

        // Act and Assert
        String result = Main.class.getMethod("appendValue", String.class, int.class).invoke(null, value);
        assertNotEquals("", result);
    }

}