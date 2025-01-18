package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedTest() {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws IOException {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        cssFormatter.doFormat("invalid css code", LineEnding.CR);
    }

    @Test
    public void doFormatValidCssCodeTest() throws IOException {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        String formattedCode = cssFormatter.doFormat("body{background-color:#ffffff;}", LineEnding.LF);

        Assert.assertTrue(formattedCode.contains("body"));
    }

}