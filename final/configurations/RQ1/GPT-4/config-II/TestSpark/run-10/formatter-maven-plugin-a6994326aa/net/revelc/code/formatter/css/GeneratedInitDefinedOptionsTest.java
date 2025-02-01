package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.mockito.Mockito;

public class GeneratedInitDefinedOptionsTest {

    @Test
    public void initDefinedOptionsTest() {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "false");
        options.put("useSourceStringValues", "true");


        formatter.init(options, Mockito.mock(ConfigurationSource.class));

        assertTrue(formatter.isInitialized());
    }

}