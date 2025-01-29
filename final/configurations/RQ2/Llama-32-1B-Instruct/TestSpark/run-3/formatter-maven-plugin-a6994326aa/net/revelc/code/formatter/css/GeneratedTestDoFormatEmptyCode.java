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

public class GeneratedTestDoFormatEmptyCode {

    @Test
    public void testDoFormatEmptyCode() {
        // Arrange
        String code = "";
        LineEnding ending = LineEnding.LF_LF;

        // Act
        CssFormatter formatter = new CssFormatter(new HashMap<>(), new ConfigurationSource());
        String result = formatter.doFormat(code, ending);

        // Assert
        assert !result.isEmpty();
    }

}