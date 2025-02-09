package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitValidParametersTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initValidParametersTest() {
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = mock(ConfigurationSource.class);

        formatter.init(options, cfg);

        // Here you should verify that your formatter has been properly initialized
        assertEquals(true, formatter.isInitialized());
    }

}