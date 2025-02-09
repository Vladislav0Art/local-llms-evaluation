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

public class GeneratedDoFormatWithNullCodeShouldThrowIOException {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatWithNullCodeShouldThrowIOException() {
        try {
            cssFormatter.doFormat(null, LineEnding.AUTO);
            fail("Expected exception not thrown");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

}