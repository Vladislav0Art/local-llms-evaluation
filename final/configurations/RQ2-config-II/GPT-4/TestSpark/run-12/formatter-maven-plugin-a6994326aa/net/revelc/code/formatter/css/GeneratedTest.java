package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, configurationSource);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(null, configurationSource);
    }

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource configurationSource = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(new HashMap<>(), configurationSource);
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String formattedCode = cssFormatter.doFormat("body {background-color: red;}", LineEnding.CRLF);

        Assert.assertEquals("body {background-color: red;}\r\n", formattedCode);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("not a css code", LineEnding.CRLF);
    }

    @Test
    public void doFormatNullCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(null, LineEnding.CRLF);
    }

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