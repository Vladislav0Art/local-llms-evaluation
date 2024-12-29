package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDoFormat_EmptyCode_ReturnsEmptyString {

    @Test
    public void doFormat_EmptyCode_ReturnsEmptyString() {
        CssFormatter formatter = new CssFormatter();
        String code = "";
        LineEnding ending = mock(LineEnding.class);
        when(ending.getEnding()).thenReturn("\n");
        assertEquals("", formatter.doFormat(code, ending));
    }

}