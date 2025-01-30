package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "true");

        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);

        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void initDefaultTest() {
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), cfg);

        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatReturnNullTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body { color: #ffffff; }";

        Assert.assertNull(formatter.doFormat(code, net.revelc.code.formatter.LineEnding.AUTO));
    }

    @Test
    public void doFormatReturnModifiedTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));
        String code = "body { color: #ffffff\t; }";

        Assert.assertEquals("body { color: #ffffff\\9; }", formatter.doFormat(code, net.revelc.code.formatter.LineEnding.AUTO));
    }

    @Test
    public void initInvalidIndentTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "invalid");

        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
    }

    @Test
    public void doFormatNullCodeTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), Mockito.mock(ConfigurationSource.class));

        formatter.doFormat(null, net.revelc.code.formatter.LineEnding.AUTO);
    }

}