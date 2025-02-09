package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}