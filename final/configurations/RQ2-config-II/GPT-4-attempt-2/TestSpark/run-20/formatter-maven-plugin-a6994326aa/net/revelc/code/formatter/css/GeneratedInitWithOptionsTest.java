package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;

public class GeneratedInitWithOptionsTest {

    @Test
    public void initWithOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        HashMap<String, String> options = new HashMap<>();
        options.put("key", "value");

        formatter.init(options, Mockito.mock(ConfigurationSource.class));

        Assert.assertTrue(formatter.isInitialized());
    }

}