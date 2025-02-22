package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);
        assertEquals(cssFormatter.formatter.getPropertiesInSeparateLines(), 4);
        assertTrue(cssFormatter.formatter.isRgbAsHex());
        assertTrue(cssFormatter.formatter.isUseSourceStringValues());
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "test code";
        LineEnding ending = LineEnding.NONE;
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertEquals(formattedCode, code);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(cssFormatter.isInitialized());
    }

}