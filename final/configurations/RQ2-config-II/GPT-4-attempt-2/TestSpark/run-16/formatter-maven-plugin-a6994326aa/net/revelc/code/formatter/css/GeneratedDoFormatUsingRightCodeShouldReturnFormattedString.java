package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedDoFormatUsingRightCodeShouldReturnFormattedString {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatUsingRightCodeShouldReturnFormattedString() throws IOException {
        String code = "body { color: white; background-color: black; }";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertEquals(formattedCode, "body { color:white; background-color:black; }");
    }

}