package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedDoFormat_OkayCode_ReturnFormattedString {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Map<String, String> options;

    private CssFormatter formatter;

    public CssFormatter() {
        this.formatter = new CssFormatter();
    }

    @Test
    public void doFormat_OkayCode_ReturnFormattedString() throws IOException {
        when(options.get("output")).thenReturn("");
        when(options.get("indentation")).thenReturn(" ");
        String code = "test";
        String result = formatter.doFormat(code, LineEnding.NATIVE);
        assertNotNull(result);
    }

}