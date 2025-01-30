package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        cssFormatter.init(options, null);
        String code = "body { background-color: red; }";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertNotNull(formattedCode);
        assertNotEquals(code, formattedCode);
    }

}