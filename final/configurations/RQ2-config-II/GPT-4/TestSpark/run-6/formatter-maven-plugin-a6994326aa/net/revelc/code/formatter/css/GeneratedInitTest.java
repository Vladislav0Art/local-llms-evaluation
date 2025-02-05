package net.revelc.code.formatter.css;

import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.LineEnding;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitTest {

    @Test
    public void initTest() throws Exception {
        final Map<String, String> options = new HashMap<>();
        final ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}