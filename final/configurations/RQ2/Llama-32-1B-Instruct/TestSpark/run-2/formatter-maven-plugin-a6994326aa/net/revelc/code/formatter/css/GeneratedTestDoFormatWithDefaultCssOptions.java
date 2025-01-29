package net.revelc.code.formatter.css;

import com.steadystate.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDoFormatWithDefaultCssOptions {

    public String doFormat(String code, LineEnding ending) {
        return doFormat(code, ending);
    }

    @Test
    public void testDoFormatWithDefaultCssOptions() {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF_ALL;
        when(ConfigurationSource.class.newInstance()).thenReturn(new ConfigurationSource());
        assertNotEquals("", CssFormatter::doFormat);
    }

}