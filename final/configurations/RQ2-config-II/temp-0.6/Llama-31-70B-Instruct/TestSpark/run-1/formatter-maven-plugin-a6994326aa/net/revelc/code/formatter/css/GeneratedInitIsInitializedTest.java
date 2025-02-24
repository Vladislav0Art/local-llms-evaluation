package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedInitIsInitializedTest {

    @Test
    public void initIsInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(cssFormatter.isInitialized());
    }

}