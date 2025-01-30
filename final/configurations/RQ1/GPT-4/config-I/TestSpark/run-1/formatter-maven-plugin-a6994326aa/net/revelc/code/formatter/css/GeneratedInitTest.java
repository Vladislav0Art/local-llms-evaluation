package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}