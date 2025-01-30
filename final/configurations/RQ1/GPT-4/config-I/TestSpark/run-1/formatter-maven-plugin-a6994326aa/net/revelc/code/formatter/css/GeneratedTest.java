package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initDefaultValuesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatWithEndingTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        String code = "body {background-color: #fff;}";

        String expectedFormat = "body {\n\tbackground-color: #fff;\n}";

        Assert.assertEquals(expectedFormat, cssFormatter.doFormat(code, LineEnding.AUTO));
    }

    @Test
    public void doFormatNullTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfgSource = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfgSource);

        String code = "body {\n\tbackground-color: #fff;\n}";

        Assert.assertNull(cssFormatter.doFormat(code, LineEnding.AUTO));
    }

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());
    }

}