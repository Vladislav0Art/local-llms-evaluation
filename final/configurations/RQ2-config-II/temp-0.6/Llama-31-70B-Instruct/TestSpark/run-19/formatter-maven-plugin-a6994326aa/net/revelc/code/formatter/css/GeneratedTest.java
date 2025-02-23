package net.revelc.code.formatter.css;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = mock(Map.class);
        when(options.getOrDefault("indent", "4")).thenReturn("4");
        when(options.getOrDefault("rgbAsHex", Boolean.TRUE.toString()))
                .thenReturn(Boolean.TRUE.toString());
        when(options.getOrDefault("useSourceStringValues", Boolean.FALSE.toString()))
                .thenReturn(Boolean.FALSE.toString());
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        assert (cssFormatter.getFormatter().getIndent() == 4);
        assert (cssFormatter.getFormatter().isRgbAsHex());
        assert (!cssFormatter.getFormatter().isUseSourceStringValues());
    }

}