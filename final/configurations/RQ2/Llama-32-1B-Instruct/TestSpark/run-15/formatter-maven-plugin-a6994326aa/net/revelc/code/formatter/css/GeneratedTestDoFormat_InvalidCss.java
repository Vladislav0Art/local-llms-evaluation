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

public class GeneratedTestDoFormat_InvalidCss {

    @Test
    public void testDoFormat_InvalidCss() {
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        when(getCssOMParser().parse("invalid css code")).thenReturn("css code");
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("", LineEnding.LF);
        assertEquals(null, result);
    }

}