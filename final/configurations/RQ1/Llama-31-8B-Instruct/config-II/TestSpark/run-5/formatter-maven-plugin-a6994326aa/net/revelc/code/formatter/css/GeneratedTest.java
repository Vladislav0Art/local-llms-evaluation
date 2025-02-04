package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.IOException;
import java.util.Map;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_WithValidOptions_ReturnsInitializedFormatter() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        ConfigurationSource cfg = new ConfigurationSource();
        formatter.init(options, cfg);
        assertEquals(true, formatter.isInitialized());
    }

    @Test
    public void init_WithInvalidIndentOption_ThrowsNumberFormatException() {
        Map<String, String> options = Map.of("indent", "abc", "rgbAsHex", "true", "useSourceStringValues", "false");
        ConfigurationSource cfg = new ConfigurationSource();
        assertThrows(NumberFormatException.class, () -> formatter.init(options, cfg));
    }

    @Test
    public void init_WithInvalidRgbAsHexOption_ThrowsNumberFormatException() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "abc", "useSourceStringValues", "false");
        ConfigurationSource cfg = new ConfigurationSource();
        assertThrows(NumberFormatException.class, () -> formatter.init(options, cfg));
    }

    @Test
    public void init_WithInvalidUseSourceStringValuesOption_ThrowsNumberFormatException() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "abc");
        ConfigurationSource cfg = new ConfigurationSource();
        assertThrows(NumberFormatException.class, () -> formatter.init(options, cfg));
    }

}