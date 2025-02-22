package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;

public class GeneratedDoFormat_WithValidInput_ReturnsFormattedCode {

    @Test
    public void doFormat_WithValidInput_ReturnsFormattedCode() throws IOException {
        // Arrange
        final String code = "body { color: black; }";
        final LineEnding ending = new LineEnding();
        final CssFormatter formatter = new CssFormatter();
        formatter.formatter = new CSSFormat();

        // Act
        final String formattedCode = formatter.doFormat(code, ending);

        // Assert
        assertEquals("body {\n    color: black;\n}\n", formattedCode);
    }

}