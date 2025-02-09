package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        String code = "body {background-color: blue;}";
        String result = formatter.doFormat(code, LineEnding.CRLF);
        assertEquals(code.trim(), result.trim());
    }

}