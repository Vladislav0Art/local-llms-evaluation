package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() throws IOException {
        // arrange
        CssFormatter cssFormatter = new CssFormatter();
        String code = "h1 {color: red}";
        LineEnding lineEnding = LineEnding.UNIX;
        CSSStyleSheetImpl sheet = Mockito.mock(CSSStyleSheetImpl.class);
        Mockito.when(sheet.getCssText(cssFormatter.formatter)).thenReturn(code);

        // act
        String formattedCode = cssFormatter.doFormat(code, lineEnding);

        // assert
        assertEquals(code, formattedCode);
    }

}