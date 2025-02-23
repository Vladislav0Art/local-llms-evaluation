package net.revelc.code.formatter.css;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.css.sac.InputSource;

public class GeneratedTestDoFormatWithInput {

    private final CssFormatter formatter = new CssFormatter();

    @Test
    public void testDoFormatWithInput() throws IOException {
        final CSSOMParser parser = mock(CSSOMParser.class);
        final CSSStyleSheetImpl sheet = mock(CSSStyleSheetImpl.class);
        when(sheet.getCssText(formatter.formatter)).thenReturn("test");
        when(parser.parseStyleSheet(new InputSource(new StringReader("test")), null, null))
                .thenReturn(sheet);
        final String code = formatter.doFormat("test", LineEnding.UNIX);
        Assert.assertEquals("test\n", code);
    }

}