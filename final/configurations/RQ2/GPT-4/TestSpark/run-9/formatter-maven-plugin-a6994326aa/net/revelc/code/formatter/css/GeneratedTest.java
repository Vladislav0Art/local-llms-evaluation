package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key", "value");
        cssFormatter.init(options, null);
        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatNoChangeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key", "value");
        cssFormatter.init(options, null);
        String result = cssFormatter.doFormat("body { background-color: #d0e4fe;}", LineEnding.AUTO);
        Assert.assertEquals("body { background-color: #d0e4fe;}", result);
    }

    @Test
    public void doFormatThrowsIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key", "value");
        cssFormatter.init(options, null);
        cssFormatter.doFormat(null, LineEnding.AUTO);
    }

    @Test
    public void isInitializedFalseByDefaultTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());
    }

}