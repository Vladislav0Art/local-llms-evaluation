package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatNotNullTest {

    @Test
    public void doFormatNotNullTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource configSource = null;
        Map<String, String> options = new HashMap<>();
        formatter.init(options, configSource);
        String code = ".example { color: red }";
        String formattedCode = formatter.doFormat(code, LineEnding.AUTO);
        assertNotNull(formattedCode);
    }

}