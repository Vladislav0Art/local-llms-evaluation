package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTestWithWindowsLineEnding {

    @Test
    public void doFormatTestWithWindowsLineEnding() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = ".class { font-size: 14px; }";
        LineEnding ending = LineEnding.CRLF;

        String expected = ".class {\r\n  font-size: 14px;\r\n}";

        Assert.assertEquals(expected, cssFormatter.doFormat(code, ending));
    }

}