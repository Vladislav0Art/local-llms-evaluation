package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.FALSE.toString());
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initWithDefaultOptionValuesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.TRUE.toString());
        cssFormatter.init(options, null);
        try {
            String result = cssFormatter.doFormat(".myClass { color: rgb(255, 255, 255); }", LineEnding.LF);
            assertEquals(".myClass {\n  color: rgb(255,255,255);\n}\n", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doFormatWithNoChangesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        try {
            String result = cssFormatter.doFormat(".myClass {\n  color: #FFFFFF;\n}\n", LineEnding.LF);
            assertNull(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void doFormatWithIeHackTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        try {
            String result = cssFormatter.doFormat(".myClass { color: #FFFFFF\\9; }", LineEnding.LF);
            assertEquals(".myClass {\n  color: #FFFFFF\\9;\n}\n", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}