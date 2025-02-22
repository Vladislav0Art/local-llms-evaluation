package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedTestInit {

    @Test
    public void testInit() {
        // arrange
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        // act
        cssFormatter.init(options, cfg);

        // assert
        assertTrue(cssFormatter.isInitialized());
    }

}