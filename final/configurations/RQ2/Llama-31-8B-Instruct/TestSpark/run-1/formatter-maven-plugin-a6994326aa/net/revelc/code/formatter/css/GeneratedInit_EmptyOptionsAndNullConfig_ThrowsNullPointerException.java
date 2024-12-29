package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInit_EmptyOptionsAndNullConfig_ThrowsNullPointerException {

    @Test
    public void init_EmptyOptionsAndNullConfig_ThrowsNullPointerException() {
        CssFormatter formatter = new CssFormatter();
        try {
            formatter.init(Collections.emptyMap(), null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}