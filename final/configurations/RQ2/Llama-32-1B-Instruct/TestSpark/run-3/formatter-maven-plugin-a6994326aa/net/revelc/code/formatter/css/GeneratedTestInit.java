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

public class GeneratedTestInit {

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

}