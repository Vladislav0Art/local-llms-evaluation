package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitWithNullOptionsAndNullCfgTest {

    private CssFormatter cssFormatter = new CssFormatter();

    @Mock
    private Map<String, String> options;

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private CSSStyleSheetImpl cssStyleSheet;

    @Mock
    private CSSOMParser cssomParser;

    @Mock
    private SACParserCSS3 sacParser;

    @Mock
    private CSSFormat cssFormat;

    @Mock
    private InputSource inputSource;

    @Mock
    private LineEnding lineEnding;

    @Test
    public void initWithNullOptionsAndNullCfgTest() {
        cssFormatter.init(null, null);
    }

}