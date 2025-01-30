package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatNullTest {

    @Test
    public void doFormatNullTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource configSource = null;
        Map<String, String> options = new HashMap<>();
        formatter.init(options, configSource);
        String code = "\t;";
        String formattedCode = formatter.doFormat(code, LineEnding.AUTO);
        assertNull(formattedCode);
    }

}