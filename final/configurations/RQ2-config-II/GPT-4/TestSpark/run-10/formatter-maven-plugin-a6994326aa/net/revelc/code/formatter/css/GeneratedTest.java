package net.revelc.code.formatter.css;

import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatWithInvalidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("invalid css code", LineEnding.AUTO);
    }

    @Test
    public void doFormatWithValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {color: black; }";
        String result = cssFormatter.doFormat(code, LineEnding.AUTO);
        Assert.assertEquals(code, result);
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedWithoutInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());
    }

}