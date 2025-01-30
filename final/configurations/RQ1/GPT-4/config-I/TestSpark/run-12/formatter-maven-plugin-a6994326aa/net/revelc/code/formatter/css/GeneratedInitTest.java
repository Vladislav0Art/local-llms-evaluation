package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "true");

        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);

        Assert.assertTrue(formatter.isInitialized());
    }

}