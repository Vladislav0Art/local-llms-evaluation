package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import static org.junit.Assert.*;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<String, String>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        String validCssCode = "body { margin: 0; padding: 0; }";
        String formattedCode = formatter.doFormat(validCssCode, LineEnding.CRLF);
        assertNotNull(formattedCode);
        assertFalse(formattedCode.isEmpty());
    }

}