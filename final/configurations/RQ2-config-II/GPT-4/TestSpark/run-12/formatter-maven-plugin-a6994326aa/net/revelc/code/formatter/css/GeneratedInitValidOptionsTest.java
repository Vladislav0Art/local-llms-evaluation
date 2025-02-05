package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitValidOptionsTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, configurationSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}