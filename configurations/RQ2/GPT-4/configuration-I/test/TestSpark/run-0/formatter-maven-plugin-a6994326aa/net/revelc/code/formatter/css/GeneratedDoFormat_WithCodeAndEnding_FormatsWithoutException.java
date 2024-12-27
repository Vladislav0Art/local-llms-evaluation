package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedDoFormat_WithCodeAndEnding_FormatsWithoutException {

    @Test
    public void doFormat_WithCodeAndEnding_FormatsWithoutException() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();

        String result = cssFormatter.doFormat("body { background-color: blue; }", LineEnding.CRLF);

        assertNotNull(result);
        assertEquals("body {background-color: blue;}\r\n", result);
    }

}