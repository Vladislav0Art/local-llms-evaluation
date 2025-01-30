package net.revelc.code.formatter.css;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import org.junit.Test;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "6");
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        options.put("indent", "4");
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatEqualCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String code = ".testClass { margin: 20px; }";

        var result = cssFormatter.doFormat(code, LineEnding.CRLF);

        assertNull(result);
    }

    @Test
    public void doFormatDifferentCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String code = "/* css comment */ .testClass { margin: 20px; }";

        String result = cssFormatter.doFormat(code, LineEnding.LF);

        assertNotNull(result);
    }

}