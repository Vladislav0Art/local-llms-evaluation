package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatEmptyCodeTest {

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        formatter.init(options, cfg);
        String result = formatter.doFormat("", LineEnding.CRLF);

        assertEquals("", result);
    }

}