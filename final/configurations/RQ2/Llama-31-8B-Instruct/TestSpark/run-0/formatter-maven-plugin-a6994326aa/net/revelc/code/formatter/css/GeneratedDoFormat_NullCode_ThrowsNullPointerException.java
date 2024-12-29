package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDoFormat_NullCode_ThrowsNullPointerException {

    @Test
    public void doFormat_NullCode_ThrowsNullPointerException() {
        CssFormatter formatter = new CssFormatter();
        try {
            formatter.doFormat(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}