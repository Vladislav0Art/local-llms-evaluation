package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

import static org.mockito.Mockito.when;

public class GeneratedIsInitializedFalse {

    @Test
    public void isInitializedFalse() {
        final CssFormatter formatter = new CssFormatter();
        when(formatter.getConfigurationSource()).thenReturn(null);
        assertFalse(formatter.isInitialized());
    }

}