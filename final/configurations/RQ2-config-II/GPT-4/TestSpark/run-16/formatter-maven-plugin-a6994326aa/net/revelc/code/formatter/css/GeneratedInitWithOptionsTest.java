package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedInitWithOptionsTest {

    @Test
    public void initWithOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        options.put("option2", "value2");

        cssFormatter.init(options, Mockito.mock(ConfigurationSource.class));
        assertTrue(cssFormatter.isInitialized());
    }

}