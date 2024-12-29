package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void init_NullOptionsAndConfig_ThrowsNullPointerException() {
        CssFormatter formatter = new CssFormatter();
        try {
            formatter.init(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}