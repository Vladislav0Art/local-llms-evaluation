package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, configurationSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}