package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatWithTabsTest {

    @Test
    public void doFormatWithTabsTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String code = "body {\tbackground-color: red;\t}";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertNotNull(formattedCode);
        assertTrue(formattedCode.contains("\\9;"));
    }

}