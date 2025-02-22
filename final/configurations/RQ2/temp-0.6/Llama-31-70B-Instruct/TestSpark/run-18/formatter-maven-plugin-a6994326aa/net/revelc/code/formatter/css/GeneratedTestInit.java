package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        cssFormatter.init(options, cfg);

        assertNotNull(cssFormatter.formatter);
        assertEquals(4, cssFormatter.formatter.getIndent());
        assertEquals(true, cssFormatter.formatter.isRgbAsHex());
        assertEquals(false, cssFormatter.formatter.isUseSourceStringValues());
    }

}