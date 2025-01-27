package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

import static org.mockito.Mockito.when;

public class GeneratedDoFormatSimpleString {

    @Test
    public void doFormatSimpleString() throws IOException {
        final String input = "body { background-color: #f2f2f2; }";
        final CssFormatter formatter = new CssFormatter();
        when(formatter.getConfigurationSource()).thenReturn(new ConfigurationSource());
        assertEquals("body {\n  background-color: #f2f2f2;\n}", formatter.doFormat(input, LineEnding.LF));
    }

}