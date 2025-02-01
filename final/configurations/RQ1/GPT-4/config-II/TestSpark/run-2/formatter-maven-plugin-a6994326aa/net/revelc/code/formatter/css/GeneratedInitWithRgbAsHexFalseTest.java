package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedInitWithRgbAsHexFalseTest {

    @Test
    public void initWithRgbAsHexFalseTest() {
        CssFormatter formatter = new CssFormatter();

        Map<String, String> options = new HashMap<>();
        options.put("rgbAsHex", "false");
        ConfigurationSource configSource = mock(ConfigurationSource.class);
        formatter.init(options, configSource);

        Assert.assertTrue(formatter.isInitialized());
    }

}