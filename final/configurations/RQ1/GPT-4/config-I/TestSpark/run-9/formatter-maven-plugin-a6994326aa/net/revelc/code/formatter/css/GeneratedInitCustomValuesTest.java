package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

import java.io.IOException;

public class GeneratedInitCustomValuesTest {

    @Test
    public void initCustomValuesTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "3");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

}