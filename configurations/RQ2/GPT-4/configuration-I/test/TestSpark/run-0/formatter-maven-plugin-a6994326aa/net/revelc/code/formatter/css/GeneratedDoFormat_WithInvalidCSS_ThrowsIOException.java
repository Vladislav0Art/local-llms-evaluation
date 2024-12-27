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

public class GeneratedDoFormat_WithInvalidCSS_ThrowsIOException {

    @Test
    public void doFormat_WithInvalidCSS_ThrowsIOException() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();

        cssFormatter.doFormat("<div> { background-color blue; }", LineEnding.CRLF);
    }

}