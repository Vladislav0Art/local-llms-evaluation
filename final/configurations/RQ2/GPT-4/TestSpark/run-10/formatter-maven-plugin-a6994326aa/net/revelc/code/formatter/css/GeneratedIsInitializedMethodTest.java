package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.Mock;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedMethodTest {

    @Mock
    ConfigurationSource configurationSource;

    @Test
    public void isInitializedMethodTest() {
        CssFormatter cssFormatter = new CssFormatter();
        boolean result = cssFormatter.isInitialized();
        assertFalse(result);
        Map<String, String> options = new HashMap<>();
        options.put("opt1", "val1");
        cssFormatter.init(options, configurationSource);
        assertTrue(cssFormatter.isInitialized());
    }

}