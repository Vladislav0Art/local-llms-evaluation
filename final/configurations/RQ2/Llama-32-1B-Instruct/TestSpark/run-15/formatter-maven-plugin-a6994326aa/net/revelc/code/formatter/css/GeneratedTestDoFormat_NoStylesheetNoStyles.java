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

public class GeneratedTestDoFormat_NoStylesheetNoStyles {

    @Test
    public void testDoFormat_NoStylesheetNoStyles() {
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        CssFormatter formatter = new CssFormatter();
        String cssCode = "@media print { body { background-image: url('image.jpg'); } }";
        when(getCssOMParser().parse(cssCode)).thenReturn("body { background-image: url('image.jpg'); }");
        String result = formatter.doFormat(cssCode, LineEnding.LF);
        assertEquals("<style>body { background-image: url('image.jpg'); }</style>", result);
    }

}