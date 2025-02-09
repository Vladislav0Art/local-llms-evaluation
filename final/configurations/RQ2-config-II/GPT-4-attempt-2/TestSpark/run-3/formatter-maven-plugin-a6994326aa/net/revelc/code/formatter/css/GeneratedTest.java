package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        cssFormatter.init(options, cfg);

        Assert.assertNotNull(cssFormatter);
    }

    @Test
    public void doFormatWithIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "any string";
        LineEnding ending = null;
        cssFormatter.doFormat(code, ending);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "any string";
        LineEnding ending = LineEnding.LF;
        Assert.assertNotNull(cssFormatter.doFormat(code, ending));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());
    }

}