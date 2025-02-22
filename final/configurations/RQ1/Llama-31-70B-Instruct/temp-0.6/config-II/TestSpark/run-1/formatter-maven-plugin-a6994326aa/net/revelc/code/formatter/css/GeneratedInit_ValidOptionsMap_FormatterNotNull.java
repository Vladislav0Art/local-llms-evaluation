package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedInit_ValidOptionsMap_FormatterNotNull {

    private CssFormatter cssFormatter;

    @Test
    public void init_ValidOptionsMap_FormatterNotNull() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);
        assertNotNull(cssFormatter.formatter);
    }

}