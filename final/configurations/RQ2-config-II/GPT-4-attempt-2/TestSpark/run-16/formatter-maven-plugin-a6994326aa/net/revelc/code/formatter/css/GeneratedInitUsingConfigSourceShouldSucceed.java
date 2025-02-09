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

public class GeneratedInitUsingConfigSourceShouldSucceed {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void initUsingConfigSourceShouldSucceed() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}