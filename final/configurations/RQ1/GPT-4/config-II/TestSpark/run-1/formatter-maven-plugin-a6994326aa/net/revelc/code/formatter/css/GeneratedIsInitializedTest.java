package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource() {
        };
        Map<String, String> options = new HashMap<>();

        cssFormatter.init(options, cfg);

        assertTrue(cssFormatter.isInitialized());
    }

}