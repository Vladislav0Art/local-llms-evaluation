package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.css.sac.InputSource;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatDifferentCodeTest {

    @Test
    public void doFormatDifferentCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");

        formatter.init(options, null);

        String code = "body { background-color: red }";
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);

        Assert.assertNotEquals(code, formattedCode);
    }

}