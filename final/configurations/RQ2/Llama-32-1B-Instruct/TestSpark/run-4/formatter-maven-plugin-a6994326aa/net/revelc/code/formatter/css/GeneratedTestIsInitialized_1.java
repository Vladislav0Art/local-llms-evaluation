package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestIsInitialized_1 {

    public static void main(String[] args) {
        new CssFormatterTest();
    }

    private static AbstractCacheableFormatter formatter = new CssFormatter();

    @Test
    public void testIsInitialized_1() {
        // Arrange
        Map<String, String> options = null;
        ConfigurationSource cfg = null;

        // Act
        boolean isInitialized = formatter.isInitialized();

        // Assert
        verify(formatter).isInitialized();
    }

}