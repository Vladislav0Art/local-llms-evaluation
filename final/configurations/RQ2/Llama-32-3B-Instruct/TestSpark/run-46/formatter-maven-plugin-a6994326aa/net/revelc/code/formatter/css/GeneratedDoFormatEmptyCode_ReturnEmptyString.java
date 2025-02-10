package net.revelc.code.formatter.css;

import org.junit.Before;
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
public class GeneratedDoFormatEmptyCode_ReturnEmptyString {

    private CssFormatter formatter = new CssFormatter();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doFormatEmptyCode_ReturnEmptyString() throws IOException {
        when(options().get("output")).thenReturn("");
        when(options().get("indentation")).thenReturn(" ");
        String code = "";
        String result = formatter.doFormat(code, LineEnding.NATIVE);
        assertEquals("", result);
    }

}