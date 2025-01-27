package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestFormatCSS {

    @Mock
    private String cssString;

    @Before
    public void setup() {
        cssString = "body { background-color: #f2f2f2; }";
    }

    @Test
    public void testFormatCSS() {
        // Arrange
        String expectedOutput = "body { background-color: #f2f2f2; }\n";
        CSSFormatter formatter = new CSSFormatter();

        // Act
        String actualOutput = formatter.format(cssString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}

class CSSFormatter {

    public String format(String cssString) {
        return cssString + "\n";
    }

}