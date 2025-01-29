package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestInvalidOption {

    @Test
    public void testInvalidOption() throws IOException {
        // Arrange
        Map<String, String> options = Collections.singletonMap("parserErrorSupport", "true");

        // Act and Assert
        assertFalse(CssFormatter.class.isInstance(formatter));
    }

}