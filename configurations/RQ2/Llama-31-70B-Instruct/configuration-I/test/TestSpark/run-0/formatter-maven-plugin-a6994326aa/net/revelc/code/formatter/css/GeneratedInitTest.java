package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    @Mock
    private Map<String, String> options;

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private AbstractCacheableFormatter abstractCacheableFormatter;

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}