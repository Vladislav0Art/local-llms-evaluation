package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        final AbstractCacheableFormatter formatter = new CssFormatter();
        assertEquals(true, formatter.isInitialized());
    }

}