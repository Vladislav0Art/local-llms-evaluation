package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.TRUE.toString());
        cssFormatter.init(options, null);
        try {
            String result = cssFormatter.doFormat(".myClass { color: rgb(255, 255, 255); }", LineEnding.LF);
            assertEquals(".myClass {\n  color: rgb(255,255,255);\n}\n", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}