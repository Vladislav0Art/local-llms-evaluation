package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {margin: 0; padding: 0;}";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertEquals("body { margin: 0; padding: 0; }", formattedCode);
    }

}