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

public class GeneratedTestDoFormat_SimpleCss {

    @Test
    public void testDoFormat_SimpleCss() {
        String cssCode = "@media print { body { color: blue; } }";
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        when(getCssOMParser().parse(cssCode)).thenReturn("body { color: blue; }");
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(cssCode, LineEnding.LF);
        assertEquals("<style>body { color: blue; }</style>", result);
    }

}