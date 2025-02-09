package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedDoFormatEmptyCodeTest {

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String formattedCode = cssFormatter.doFormat("", LineEnding.AUTO);
        assertEquals("", formattedCode);
    }

}