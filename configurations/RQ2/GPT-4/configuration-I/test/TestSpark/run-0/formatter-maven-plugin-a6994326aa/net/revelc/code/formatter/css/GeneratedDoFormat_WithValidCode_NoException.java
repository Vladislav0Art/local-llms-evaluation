package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedDoFormat_WithValidCode_NoException {

    @Test
    public void doFormat_WithValidCode_NoException() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat("body { color: red; }", LineEnding.LF);
        assertNotNull(result);
        assertEquals("body { color: red; }", result);
    }

}