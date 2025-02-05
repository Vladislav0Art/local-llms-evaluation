package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatWithCodeTest {

    @Test
    public void doFormatWithCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        formatter.init(options, cfg);
        String result = formatter.doFormat("body { color: #333; }", LineEnding.LF);

        assertEquals("body{ color: #333; }", result);
    }

}