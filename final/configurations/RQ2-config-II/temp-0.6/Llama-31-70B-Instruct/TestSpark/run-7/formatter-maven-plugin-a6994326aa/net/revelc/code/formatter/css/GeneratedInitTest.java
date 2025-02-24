package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedInitTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initTest() {
        // Given
        Map<String, String> options = mock(Map.class);

        // When
        formatter.init(options, null);

        // Then
        assertNotNull(formatter.getOptions());
        assertTrue(formatter.isInitialized());
    }

}