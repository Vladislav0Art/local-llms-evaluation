package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitDefaultTest {

    @Test
    public void initDefaultTest() {
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), cfg);

        Assert.assertTrue(formatter.isInitialized());
    }

}