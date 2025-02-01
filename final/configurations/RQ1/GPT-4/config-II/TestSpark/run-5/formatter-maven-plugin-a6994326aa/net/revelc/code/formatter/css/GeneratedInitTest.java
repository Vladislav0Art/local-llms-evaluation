package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.css.sac.InputSource;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        formatter.init(options, null);

        Assert.assertTrue(formatter.isInitialized());
    }

}