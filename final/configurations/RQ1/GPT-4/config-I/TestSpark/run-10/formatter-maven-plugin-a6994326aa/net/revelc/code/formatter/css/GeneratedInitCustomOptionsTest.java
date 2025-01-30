package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedInitCustomOptionsTest {

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

}