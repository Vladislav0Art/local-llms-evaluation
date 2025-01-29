package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTestDoFormat_NullStylesheet_NoError {

    private final CssFormatter formatter = new CssFormatter();

    @Test
    public void testDoFormat_NullStylesheet_NoError() throws IOException {
        Mockito.mock(InputSource.class);
        InputSource inputSource = new File("input.css");
        Mockito.mock(Map.class);
        Map<String, String> options = null;
        assertEquals("", formatter.doFormat(inputSource, options));
        verifyNoMoreInteractions(formatter);
    }

}