package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedDoFormatTest {

    // Mock the ConfigurationSource object
    ConfigurationSource cfg = mock(ConfigurationSource.class);

    @Test
    public void doFormatTest() throws IOException {
        Map<String, String> options = new HashMap<>();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        String formattedCode = formatter.doFormat("h1 \n{color: tab;}", LineEnding.CRLF);
        assertNotNull(formattedCode);
        assertEquals("h1 {\n  color: \\9;\n}", formattedCode);
    }

}