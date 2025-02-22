package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.types.Commandline;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        formatter.init(options, null);
        assertEquals(4, formatter.getFormatter().getPropertiesInSeparateLines());
        assertTrue(formatter.getFormatter().isRgbAsHex());
        assertFalse(formatter.getFormatter().isUseSourceStringValues());
    }

}