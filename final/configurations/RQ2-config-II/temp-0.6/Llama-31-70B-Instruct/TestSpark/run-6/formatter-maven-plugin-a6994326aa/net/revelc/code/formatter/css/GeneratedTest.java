package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void formatWithSampleCodeTest() throws IOException {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        String sampleCSS = "body { font-size: 14px; color: #fff; }";
        String expectedOutput = "body {\n    font-size: 14px;\n    color: #fff;\n}";

        // Act
        String formattedCode = formatter.format(sampleCSS);

        // Assert
        assertEquals(expectedOutput, formattedCode);
    }

}