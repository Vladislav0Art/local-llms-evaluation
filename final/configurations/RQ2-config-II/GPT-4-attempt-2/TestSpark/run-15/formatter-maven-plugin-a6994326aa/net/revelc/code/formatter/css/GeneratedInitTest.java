package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter testFormatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        testFormatter.init(new HashMap<String, String>(), cfg);
        Assert.assertTrue(testFormatter.isInitialized());
    }

}