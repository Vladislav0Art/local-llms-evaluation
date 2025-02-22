package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    private CssFormatter cssFormatter;

    @Before
    public void setup() {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void initTest() {
        Map<String, String> options = mock(Map.class);
        ConfigurationSource cfg = mock(ConfigurationSource.class);

        when(options.getOrDefault("indent", "4")).thenReturn("4");
        when(options.getOrDefault("rgbAsHex", Boolean.TRUE.toString())).thenReturn(Boolean.TRUE.toString());
        when(options.getOrDefault("useSourceStringValues", Boolean.FALSE.toString())).thenReturn(Boolean.FALSE.toString());

        cssFormatter.init(options, cfg);

        assertNotNull(cssFormatter.formatter);
    }

}