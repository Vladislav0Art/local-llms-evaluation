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

public class GeneratedInitTest {

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

}