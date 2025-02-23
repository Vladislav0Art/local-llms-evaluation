package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestInitWithIndent4AndRgbAsHex {

    private CssFormatter cssFormatter;

    @Test
    public void testInitWithIndent4AndRgbAsHex() {
        final Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", Boolean.TRUE.toString());

        final ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);

        assertEquals(4, cssFormatter.formatter.getIndent());
        assertEquals(true, cssFormatter.formatter.isRgbAsHex());
    }

}