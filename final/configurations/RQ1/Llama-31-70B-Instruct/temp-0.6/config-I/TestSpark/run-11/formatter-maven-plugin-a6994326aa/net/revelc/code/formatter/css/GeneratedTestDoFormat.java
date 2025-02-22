package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() throws IOException {
        // Arrange
        String code = "body { font-size: 16px; }";
        String expectedResult = "body {\n    font-size: 16px;\n}";
        CssFormatter formatter = new CssFormatter();
        LineEnding lineEnding = LineEnding.UNIX;

        // Act
        String formattedCode = formatter.doFormat(code, lineEnding);

        // Assert
        assertEquals(formattedCode, expectedResult);
    }

}