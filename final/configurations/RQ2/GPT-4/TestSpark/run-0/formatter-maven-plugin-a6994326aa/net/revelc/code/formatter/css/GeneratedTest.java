package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(Collections.emptyMap(), null);
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("", LineEnding.LF);
        Assert.assertEquals("", result);
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color : #fff ; }";
        String expected = "body {\n  color: #fff;\n}\n";
        String result = formatter.doFormat(code, LineEnding.CRLF);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat("body { color : #fff ;", LineEnding.CRLF);
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(Collections.emptyMap(), null);
        Assert.assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
    }

}