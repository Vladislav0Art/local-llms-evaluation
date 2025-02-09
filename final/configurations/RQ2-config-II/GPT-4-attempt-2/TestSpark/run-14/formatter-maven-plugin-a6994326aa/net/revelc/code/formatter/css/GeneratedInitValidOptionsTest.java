package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedInitValidOptionsTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(new HashMap<>(), cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}