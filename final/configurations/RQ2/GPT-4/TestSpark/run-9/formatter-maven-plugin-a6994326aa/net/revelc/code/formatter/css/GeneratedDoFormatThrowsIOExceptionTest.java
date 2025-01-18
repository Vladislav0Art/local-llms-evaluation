package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatThrowsIOExceptionTest {

    @Test
    public void doFormatThrowsIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("key", "value");
        cssFormatter.init(options, null);
        cssFormatter.doFormat(null, LineEnding.AUTO);
    }

}