package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedIsInitialized_IsTrue {

    @Test
    public void isInitialized_IsTrue() {
        new CssFormatter().init(new HashMap<>(), mock(ConfigurationSource.class));
        boolean result = new CssFormatter().isInitialized();
        assertTrue(result);
    }

}