package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class GeneratedTestBuildWithMultipleAppenders {

    @Test
    public void testBuildWithMultipleAppenders() throws Exception {
        // Arrange
        int value = 12345;

        // Act
        String result = buildValue(value);

        // Assert
        assertNotEquals("", result);
    }

    private String buildValue(int value) {
        return appendValue(0, value); // Use public method to avoid error
    }

}