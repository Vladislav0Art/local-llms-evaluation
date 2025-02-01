package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatSameCodeTest {

    @Test
    public void doFormatSameCodeTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource() {
        };
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        cssFormatter.init(options, cfg);
        String code = "h1 { color: #0000ff; }";

        String formattedCode = cssFormatter.doFormat(code, LineEnding.CRLF);

        assertNull(formattedCode);
    }

}