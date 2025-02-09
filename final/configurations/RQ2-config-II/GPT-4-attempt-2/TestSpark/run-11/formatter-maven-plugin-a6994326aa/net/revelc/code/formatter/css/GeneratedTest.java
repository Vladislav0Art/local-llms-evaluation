package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource configurationSource = mock(ConfigurationSource.class);
        cssFormatter.init(options, configurationSource);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatIOExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(null, LineEnding.AUTO);
    }

    @Test
    public void doFormatSuccessTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource configurationSource = mock(ConfigurationSource.class);
        cssFormatter.init(options, configurationSource);
        String output = cssFormatter.doFormat(".test { color: #000; }", LineEnding.AUTO);
        assertEquals(".test{color:#000;}", output);
    }

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

}