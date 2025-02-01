package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        cssFormatter.init(options, new ConfigurationSource());
        assertTrue(cssFormatter.isInitialized());
    }

}