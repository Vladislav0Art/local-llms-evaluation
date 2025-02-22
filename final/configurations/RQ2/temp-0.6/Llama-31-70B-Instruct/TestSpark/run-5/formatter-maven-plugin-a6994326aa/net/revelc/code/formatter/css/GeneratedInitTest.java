package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getLineEnding()).thenReturn(LineEnding.LF);

        formatter.init(options, cfg);

        assertEquals(4, formatter.formatter.getPropertiesInSeparateLines());
        assertEquals(true, formatter.formatter.isRgbAsHex());
        assertEquals(false, formatter.formatter.isUseSourceStringValues());
    }

}