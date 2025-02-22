package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.types.Commandline;

public class GeneratedInitTest_InvalidOptions {

    @Test
    public void initTest_InvalidOptions() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "invalid");
        options.put("rgbAsHex", "invalid");
        options.put("useSourceStringValues", "invalid");
        formatter.init(options, null);
        assertEquals(0, formatter.getFormatter().getPropertiesInSeparateLines());
        assertFalse(formatter.getFormatter().isRgbAsHex());
        assertFalse(formatter.getFormatter().isUseSourceStringValues());
    }

}