package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.*;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedInitValidOptionsTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource configSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, configSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}