package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatCSSCodeTest {

    @Test
    public void doFormatCSSCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String cssCode = "h1 {color:red; font-size:20px;}";
        String expectedFormattedCode = "h1 {\n    color: red;\n    font-size: 20px;\n}";
        Assert.assertEquals(expectedFormattedCode, formatter.doFormat(cssCode, LineEnding.CRLF));
    }

}