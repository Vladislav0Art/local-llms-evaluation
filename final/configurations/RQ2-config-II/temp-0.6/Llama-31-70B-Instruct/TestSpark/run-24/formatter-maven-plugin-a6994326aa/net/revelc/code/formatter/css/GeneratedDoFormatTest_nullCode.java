package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatTest_nullCode {

    @Test
    public void doFormatTest_nullCode() throws IOException {
        // Arrange
        CssFormatter cssFormatter = new CssFormatter();
        String code = null;
        LineEnding ending = LineEnding.UNIX;

        // Act
        String formattedCode = cssFormatter.doFormat(code, ending);

        // Assert
        assertNull(formattedCode);
    }

}