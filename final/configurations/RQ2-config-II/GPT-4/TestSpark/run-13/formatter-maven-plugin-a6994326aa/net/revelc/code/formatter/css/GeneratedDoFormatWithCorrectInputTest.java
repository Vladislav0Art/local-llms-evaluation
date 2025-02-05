package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatWithCorrectInputTest {

    @Test
    public void doFormatWithCorrectInputTest() throws IOException {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);

        String code = ".class { margin: 0; }";
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);

        assertNotNull(formattedCode);
        // Assuming the formatted code doesn't change
        assertEquals(code, formattedCode);
    }

}