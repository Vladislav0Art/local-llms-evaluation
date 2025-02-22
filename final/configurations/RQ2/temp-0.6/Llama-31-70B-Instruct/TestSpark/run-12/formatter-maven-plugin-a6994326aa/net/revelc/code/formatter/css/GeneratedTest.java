package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Test
    public void testInit() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        ConfigurationSource cfg = null;
        cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertNotEquals(null, cssFormatter.getFormatter());
    }

    @Test
    public void testDoFormat() throws IOException {
        cssFormatter = new CssFormatter();
        String code = "div {color: red;}";
        LineEnding ending = LineEnding.NONE;
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertEquals(code, formattedCode);
    }

    @Test
    public void testIsInitialized() {
        cssFormatter = new CssFormatter();
        assertEquals(true, cssFormatter.isInitialized());
    }

}