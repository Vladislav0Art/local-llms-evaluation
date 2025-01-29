package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.io.StringReader;

public class GeneratedTestIsInitialized_SimpleCss {

    @Test
    public void testIsInitialized_SimpleCss() {
        when(getConfig()).thenReturn(new ConfigurationSource());
        CssFormatter formatter = new CssFormatter();
        boolean isInitialized = formatter.isInitialized();
        assertTrue(isInitialized, "Expected isInitialized to return true");
    }

}