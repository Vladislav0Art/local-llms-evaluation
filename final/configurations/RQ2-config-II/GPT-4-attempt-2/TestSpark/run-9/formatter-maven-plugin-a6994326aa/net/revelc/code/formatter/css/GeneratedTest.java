package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initNullOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("opt1", "val1");
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Assert.assertEquals("", formatter.doFormat("", LineEnding.CRLF));
    }

    @Test
    public void doFormatCSSCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String cssCode = "h1 {color:red; font-size:20px;}";
        String expectedFormattedCode = "h1 {\n    color: red;\n    font-size: 20px;\n}";
        Assert.assertEquals(expectedFormattedCode, formatter.doFormat(cssCode, LineEnding.CRLF));
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);
        Assert.assertTrue(formatter.isInitialized());
    }

}