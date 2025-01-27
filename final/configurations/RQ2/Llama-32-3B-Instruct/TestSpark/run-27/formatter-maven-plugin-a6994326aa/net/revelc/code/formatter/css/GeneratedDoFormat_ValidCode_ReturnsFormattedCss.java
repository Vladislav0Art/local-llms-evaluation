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
public class GeneratedDoFormat_ValidCode_ReturnsFormattedCss {

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
    public void doFormat_ValidCode_ReturnsFormattedCss() throws IOException {
        String code = "body { background-color: red; }";
        String expected = format.format(new InputSource(new StringReader(code)), CSSStyleSheetImpl.class);
        String result = formatter.doFormat(code, LineEnding.LF);
        assertEquals(expected, result);
    }

}