package net.revelc.code.formatter.css;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    @Mock
    private ConfigurationSource cfg;

    @Test
    public void initTest() {
        // Arrange
        Map<String, String> options = mock(Map.class);
        CssFormatter cssFormatter = new CssFormatter();

        // Act
        cssFormatter.init(options, cfg);

        // Assert
        assertTrue(cssFormatter.isInitialized());
    }

}