package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedInitValidOptionsTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indentSize", "4");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

}