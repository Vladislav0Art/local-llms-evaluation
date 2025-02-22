package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.AbstractCacheableFormatter;

import java.io.IOException;
import java.util.Map;

import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class GeneratedTestInitWithOptionsAndCfg {

    @Test
    public void testInitWithOptionsAndCfg() {
        Map<String, String> options = mock(Map.class);
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter testObject = new CssFormatter();
        testObject.init(options, cfg);
        assertTrue(testObject.isInitialized());
    }

}