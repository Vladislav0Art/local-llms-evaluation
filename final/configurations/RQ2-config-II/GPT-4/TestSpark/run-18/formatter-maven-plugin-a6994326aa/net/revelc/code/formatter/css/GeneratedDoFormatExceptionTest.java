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

public class GeneratedDoFormatExceptionTest {

    @Test
    public void doFormatExceptionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "p { color: red ";
        LineEnding ending = LineEnding.CRLF;

        cssFormatter.init(new HashMap<>(), mock(ConfigurationSource.class));
        cssFormatter.doFormat(code, ending);
    }

}