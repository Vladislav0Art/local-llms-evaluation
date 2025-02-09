package net.revelc.code.formatter.css;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        options.put("optionOne", "valueOne");
        options.put("optionTwo", "valueTwo");
        ConfigurationSource cfg = new ConfigurationSource();

        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}