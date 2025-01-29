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

public class GeneratedTestDoFormatCssRuleAttribute {

    public String doFormat(String code, LineEnding ending) {
        return doFormat(code, ending);
    }

    @Test
    public void testDoFormatCssRuleAttribute() {
        InputSource source = new InputSource(new StringReader("body { background-color: #f2f2f2; color: red; }"));
        CSSOMParser parser = new SACParserCSS3();
        CSSFormat format = new CSSFormat();
        CSSStyleSheetImpl stylesheet = (CSSStyleSheetImpl) ((AbstractCacheableFormatter) Mockito.mock(AbstractCacheableFormatter.class)).init(Map.of(), new ConfigurationSource());
        when(parser.parse()).thenReturn(stylesheet);
        assertDoesNotThrow(() -> {
            CssFormatter.cssFormatter.doFormat(source, ending);
            return null;
        });
    }

}