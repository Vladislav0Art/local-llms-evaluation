package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatTest_validCodeAndEnding {

    @Test
    public void doFormatTest_validCodeAndEnding() throws IOException {
        // Arrange
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.UNIX;

        // Act
        String formattedCode = cssFormatter.doFormat(code, ending);

        // Assert
        assertEquals("body {\n    color: red;\n}\n", formattedCode);
    }

}