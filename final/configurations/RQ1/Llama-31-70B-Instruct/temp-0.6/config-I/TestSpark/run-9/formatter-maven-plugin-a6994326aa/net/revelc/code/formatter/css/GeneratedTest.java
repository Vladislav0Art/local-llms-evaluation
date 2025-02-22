package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    private CssFormatter formatter;

    @Test
    public void testInit() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        formatter = new CssFormatter();
        formatter.init(options);
        assertNotNull(formatter);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void testDoFormat() throws IOException {
        String code = "body {background-color: red;}";
        LineEnding ending = LineEnding.LF;
        String expectedOutput = "body {\n    background-color: red;\n}";
        String formattedOutput = formatter.doFormat(code, ending);
        assertEquals(expectedOutput, formattedOutput);
    }

}