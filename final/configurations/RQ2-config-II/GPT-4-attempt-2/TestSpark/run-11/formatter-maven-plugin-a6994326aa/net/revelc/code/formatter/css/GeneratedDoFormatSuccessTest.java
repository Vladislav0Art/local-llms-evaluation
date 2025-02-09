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

public class GeneratedDoFormatSuccessTest {

    @Test
    public void doFormatSuccessTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource configurationSource = mock(ConfigurationSource.class);
        cssFormatter.init(options, configurationSource);
        String output = cssFormatter.doFormat(".test { color: #000; }", LineEnding.AUTO);
        assertEquals(".test{color:#000;}", output);
    }

}