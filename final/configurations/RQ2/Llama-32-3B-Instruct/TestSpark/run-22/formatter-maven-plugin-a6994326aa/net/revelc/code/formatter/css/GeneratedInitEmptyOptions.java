package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

import static org.mockito.Mockito.when;

public class GeneratedInitEmptyOptions {

    @Test
    public void initEmptyOptions() {
        final CssFormatter formatter = new CssFormatter();
        final Map<String, String> options = new java.util.HashMap<>();
        when(formatter.getConfigurationSource()).thenReturn(new ConfigurationSource());
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}