package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatWithCodeAndLineEndingTest {

    @Test
    public void doFormatWithCodeAndLineEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "h1 {color: red;}";
        LineEnding lineEnding = LineEnding.UNIX;
        String formattedCode = formatter.doFormat(code, lineEnding);
        assertEquals(formattedCode, "h1 {\n\tcolor: red;\n}");
    }

}