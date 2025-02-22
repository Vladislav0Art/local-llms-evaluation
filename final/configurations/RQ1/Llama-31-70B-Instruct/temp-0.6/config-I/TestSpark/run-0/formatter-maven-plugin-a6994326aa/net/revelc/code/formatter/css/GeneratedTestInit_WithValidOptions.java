package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedTestInit_WithValidOptions {

    @Test
    public void testInit_WithValidOptions() {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        final CssFormatter formatter = new CssFormatter();

        // Act
        formatter.init(options, null);

        // Assert
        assertEquals(4, formatter.formatter.getPropertiesInSeparateLines());
        assertEquals(true, formatter.formatter.getRgbAsHex());
        assertEquals(false, formatter.formatter.getUseSourceStringValues());
    }

}