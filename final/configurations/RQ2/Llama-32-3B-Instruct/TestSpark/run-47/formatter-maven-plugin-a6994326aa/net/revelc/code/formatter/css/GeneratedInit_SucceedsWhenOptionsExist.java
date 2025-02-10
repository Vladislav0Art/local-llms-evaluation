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

public class GeneratedInit_SucceedsWhenOptionsExist {

    @Test
    public void init_SucceedsWhenOptionsExist() {
        Map<String, String> options = new HashMap<>();
        options.put("option", "value");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.init(options, cfg));
    }

}