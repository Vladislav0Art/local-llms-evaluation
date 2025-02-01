package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedInitDefaultOptionsTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();

        formatter.init(options, Mockito.mock(ConfigurationSource.class));
        assertTrue(formatter.isInitialized());
    }

}