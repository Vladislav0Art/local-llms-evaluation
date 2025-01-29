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

public class GeneratedTestDoFormatInvalidCode {

    @Test
    public void testDoFormatInvalidCode() {
        // Arrange
        String code = "invalid-code";
        LineEnding ending = LineEnding.LF_LF;

        // Act
        CssFormatter formatter = new CssFormatter(new HashMap<>(), new ConfigurationSource());
        try {
            formatter.doFormat(code, ending);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}