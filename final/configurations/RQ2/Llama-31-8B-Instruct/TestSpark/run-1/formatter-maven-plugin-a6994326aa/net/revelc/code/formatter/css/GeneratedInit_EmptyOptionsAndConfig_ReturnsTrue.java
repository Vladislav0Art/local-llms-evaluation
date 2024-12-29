package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInit_EmptyOptionsAndConfig_ReturnsTrue {

    @Test
    public void init_EmptyOptionsAndConfig_ReturnsTrue() {
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.init(Collections.emptyMap(), null));
    }

}