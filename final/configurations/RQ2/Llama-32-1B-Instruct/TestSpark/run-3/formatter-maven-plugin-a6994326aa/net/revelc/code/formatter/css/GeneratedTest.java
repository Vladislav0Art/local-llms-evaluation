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

public class GeneratedTest {

    @Test
    public void testInit() {
        // Arrange
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Assert
        assert formatter != null;
    }

    @Test
    public void testDoFormatCss() {
        // Arrange
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF_LF;

        // Act
        CssFormatter formatter = new CssFormatter(new HashMap<>(), new ConfigurationSource());
        String result = formatter.doFormat(code, ending);

        // Assert
        assert !result.isEmpty();
    }

    @Test
    public void testDoFormatHtml() {
        // Arrange
        String code = "<body><h1>Hello World!</h1></body>";
        LineEnding ending = LineEnding.LF_LF;

        // Act
        CssFormatter formatter = new CssFormatter(new HashMap<>(), new ConfigurationSource());
        String result = formatter.doFormat(code, ending);

        // Assert
        assert !result.isEmpty();
    }

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

    @Test
    public void testIsInitialized() {
        // Arrange
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options, cfg);

        // Assert
        assert formatter.isInitialized();
    }

}