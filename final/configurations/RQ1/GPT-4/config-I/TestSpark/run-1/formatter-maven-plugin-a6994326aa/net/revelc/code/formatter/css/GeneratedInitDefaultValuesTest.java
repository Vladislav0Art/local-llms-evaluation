package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedInitDefaultValuesTest {

    @Test
    public void initDefaultValuesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}