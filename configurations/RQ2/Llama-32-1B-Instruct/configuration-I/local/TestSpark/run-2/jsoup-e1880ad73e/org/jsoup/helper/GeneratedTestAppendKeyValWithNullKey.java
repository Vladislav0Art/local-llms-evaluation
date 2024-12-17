package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedTestAppendKeyValWithNullKey {

    @Test
    public void testAppendKeyValWithNullKey() throws Exception {
        // Arrange
        int value = 10;

        // Act and Assert
        String result = Main.class.getMethod("appendValue", String.class, int.class).invoke(null, value);
        assertNotEquals("", result);
    }

}