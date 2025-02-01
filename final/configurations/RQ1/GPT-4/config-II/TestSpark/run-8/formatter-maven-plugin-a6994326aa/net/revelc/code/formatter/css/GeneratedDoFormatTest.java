package net.revelc.code.formatter.css;

import com.steadystate.css.format.CSSFormat;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();

        options.put("indent", "2");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        cssFormatter.init(options, null);
        String code = ".my-class { color: #fff; }";
        String expected = ".my-class {\n  color: rgb(255, 255, 255);\n}";

        try {
            Assert.assertEquals(expected, cssFormatter.doFormat(code, LineEnding.AUTO));
        } catch (IOException e) {
            Assert.fail("Test failed due to IOException: " + e.getMessage());
        }
    }

}