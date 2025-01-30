package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initCustomOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatNonFormattedCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        String code = ".testClass {\n\n  color:   rgb(255,255,255);}";
        String formattedCodeExpected = ".testClass {\n    color: #ffffff;\n}";

        assertEquals(formattedCodeExpected, cssFormatter.doFormat(code, LineEnding.CRLF));
    }

    @Test
    public void doFormatAlreadyFormattedCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        String code = ".testClass {\n    color: #ffffff;\n}";

        assertNull(cssFormatter.doFormat(code, LineEnding.CRLF));
    }

    @Test
    public void doFormatTabToIEHackConversionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        String code = ".testClass {\n\tcolor: #ffffff;\n}";

        String formattedCodeExpected = ".testClass {\n    color: #ffffff\\9;\n}";

        assertEquals(formattedCodeExpected, cssFormatter.doFormat(code, LineEnding.CRLF));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();

        assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

}