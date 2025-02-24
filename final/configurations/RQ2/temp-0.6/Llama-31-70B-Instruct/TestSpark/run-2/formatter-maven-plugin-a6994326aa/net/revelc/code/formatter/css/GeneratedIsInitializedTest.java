package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedTest {

    private static final Map<String, String> OPTIONS = Collections.emptyMap();
    private static final ConfigurationSource CONFIGURATION_SOURCE = mock(ConfigurationSource.class);
    private static final String CODE = "code";
    private static final String ENDING = "ending";
    private static final LineEnding LINE_ENDING = LineEnding.LF;

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(cssFormatter.isInitialized());
    }

}