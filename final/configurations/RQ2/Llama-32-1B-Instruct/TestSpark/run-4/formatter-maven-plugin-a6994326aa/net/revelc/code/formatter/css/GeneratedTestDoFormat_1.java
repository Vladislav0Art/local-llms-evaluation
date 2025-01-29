package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestDoFormat_1 {

    public static void main(String[] args) {
        new CssFormatterTest();
    }

    private static AbstractCacheableFormatter formatter = new CssFormatter();

    @Test
    public void testDoFormat_1() throws IOException {
        // Arrange
        String code = "<style>\nbody {\n    background-color: #fff;\n}\n</style>";
        LineEnding ending = LineEnding.LF_CRLF;

        // Act
        String formattedCode = formatter.doFormat(code, ending);

        // Assert
        verify(formatter).doFormat(any(String.class), any(LineEnding.class));
    }

}