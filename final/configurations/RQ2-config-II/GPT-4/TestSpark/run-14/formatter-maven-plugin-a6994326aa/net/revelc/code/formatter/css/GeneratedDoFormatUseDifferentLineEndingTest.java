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

public class GeneratedDoFormatUseDifferentLineEndingTest {

    @Test
    public void doFormatUseDifferentLineEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: blue; }";
        String formattedCode = formatter.doFormat(code, LineEnding.AUTO);

        // Using different line ending should result in different formatted code
        assertNotEquals("doFormat should return different result for different line ending", formattedCode, formatter.doFormat(code, LineEnding.CR));
    }

}