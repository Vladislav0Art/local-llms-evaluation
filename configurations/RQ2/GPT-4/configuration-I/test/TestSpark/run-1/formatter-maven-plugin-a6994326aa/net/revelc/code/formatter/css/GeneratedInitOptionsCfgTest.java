package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitOptionsCfgTest {

    @Test
    public void initOptionsCfgTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Map<String, String> options = new HashMap<>();

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

}