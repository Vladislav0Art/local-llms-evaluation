package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitTestWithoutOptions {

    @Test
    public void initTestWithoutOptions() {
        // Arrange
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = null;
        ConfigurationSource cfg = mock(ConfigurationSource.class);

        // Act
        formatter.init(options, cfg);

        // Assert
        assertTrue(formatter.isInitialized());
    }

}