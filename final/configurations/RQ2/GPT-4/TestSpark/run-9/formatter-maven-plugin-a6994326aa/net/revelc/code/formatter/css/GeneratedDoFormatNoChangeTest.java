package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatNoChangeTest {

    @Test
    public void doFormatNoChangeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key", "value");
        cssFormatter.init(options, null);
        String result = cssFormatter.doFormat("body { background-color: #d0e4fe;}", LineEnding.AUTO);
        Assert.assertEquals("body { background-color: #d0e4fe;}", result);
    }

}