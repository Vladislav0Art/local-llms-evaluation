package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.CSSOMParser;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "p { color: red }";
        LineEnding ending = LineEnding.CRLF;

        cssFormatter.init(new HashMap<>(), mock(ConfigurationSource.class));
        String formattedCode = cssFormatter.doFormat(code, ending);

        assertNotNull(formattedCode);
        assertTrue(formattedCode.startsWith("p"));
        assertTrue(formattedCode.endsWith("red }" + ending.getChars()));
    }

}