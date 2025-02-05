package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatWithCrLfEndingTest {

    @Test
    public void doFormatWithCrLfEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: #000; }";
        String formattedCode = formatter.doFormat(code, LineEnding.CRLF);

        assertEquals(code, formattedCode);
    }

}