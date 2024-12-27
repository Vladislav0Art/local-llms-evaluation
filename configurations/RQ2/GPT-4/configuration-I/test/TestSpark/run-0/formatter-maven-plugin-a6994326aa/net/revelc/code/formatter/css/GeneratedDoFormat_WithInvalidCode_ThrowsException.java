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

public class GeneratedDoFormat_WithInvalidCode_ThrowsException {

    @Test
    public void doFormat_WithInvalidCode_ThrowsException() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat("invalid css code", LineEnding.LF);
    }

}