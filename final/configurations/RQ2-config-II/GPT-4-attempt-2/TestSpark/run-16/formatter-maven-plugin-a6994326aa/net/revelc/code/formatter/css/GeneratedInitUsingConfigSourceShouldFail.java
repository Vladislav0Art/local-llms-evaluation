package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedInitUsingConfigSourceShouldFail {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void initUsingConfigSourceShouldFail() {
        try {
            ConfigurationSource cfg = mock(ConfigurationSource.class);
            cssFormatter.init(null, cfg);
            fail("Expected an exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

}