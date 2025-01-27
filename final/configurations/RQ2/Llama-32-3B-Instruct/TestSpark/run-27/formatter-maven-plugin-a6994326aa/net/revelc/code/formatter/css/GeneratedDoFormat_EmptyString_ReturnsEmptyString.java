package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat_EmptyString_ReturnsEmptyString {

    @Mock
    private CSSFormat format;

    @Mock
    private ConfigurationSource cfg;

    private CssFormatter formatter;

    public CssFormatter() {
        this.formatter = new CssFormatter();
        this.formatter.setFormat(format);
        this.formatter.setConfigurationSource(cfg);
    }

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doFormat_EmptyString_ReturnsEmptyString() throws IOException {
        String code = "";
        String result = formatter.doFormat(code, LineEnding.LF);
        assertEquals("", result);
    }

}