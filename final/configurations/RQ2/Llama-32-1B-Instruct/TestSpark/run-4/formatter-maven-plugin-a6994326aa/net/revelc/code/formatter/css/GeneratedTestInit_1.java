package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestInit_1 {

    public static void main(String[] args) {
        new CssFormatterTest();
    }

    private static AbstractCacheableFormatter formatter = new CssFormatter();

    @Test
    public void testInit_1() throws IOException, Exception {
        // Arrange
        Map<String, String> options = null;
        ConfigurationSource cfg = null;

        // Act
        formatter.init(options, cfg);

        // Assert
        verify(formatter).init(any(Map.class), any(ConfigurationSource.class));
    }

}