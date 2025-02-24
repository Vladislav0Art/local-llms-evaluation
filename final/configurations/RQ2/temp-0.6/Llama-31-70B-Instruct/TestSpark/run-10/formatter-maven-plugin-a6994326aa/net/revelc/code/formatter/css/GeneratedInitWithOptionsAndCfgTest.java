package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitWithOptionsAndCfgTest {

    private CssFormatter cssFormatter;

    @Test
    public void initWithOptionsAndCfgTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter = new CssFormatter();

        cssFormatter.init(options, cfg);

        assertTrue(cssFormatter.isInitialized());
    }

}