package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.*;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource configSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, configSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource configSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, configSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {background-color: lightblue;}";
        LineEnding ending = LineEnding.AUTO;

        String result = cssFormatter.doFormat(code, ending);

        Assert.assertEquals("body {\n  background-color: lightblue;\n}\n", result);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {backgroundcolour: lightblue;}";
        LineEnding ending = LineEnding.AUTO;

        cssFormatter.doFormat(code, ending);
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource configSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, configSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}