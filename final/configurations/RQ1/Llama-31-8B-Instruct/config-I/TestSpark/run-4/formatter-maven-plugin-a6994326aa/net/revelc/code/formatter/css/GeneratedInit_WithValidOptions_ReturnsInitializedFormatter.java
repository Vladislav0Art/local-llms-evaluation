package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.IOException;
import java.util.Map;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_WithValidOptions_ReturnsInitializedFormatter {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_WithValidOptions_ReturnsInitializedFormatter() {
        Map<String, String> options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        ConfigurationSource cfg = new ConfigurationSource();
        formatter.init(options, cfg);
        assertEquals(true, formatter.isInitialized());
    }

}