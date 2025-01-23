package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_EmptyOptions_ReturnsTrue() {
        Map<String, String> options = Map.of();
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public void init(Map<String, String> options) {
                // do nothing
            }
        };
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void init_NullOptions_ThrowsNullPointerException() {
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public void init(Map<String, String> options) {
                // do nothing
            }
        };
        assertThrows(NullPointerException.class, () -> formatter.init(null, cfg));
    }

    @Test
    public void init_NullConfigurationSource_ThrowsNullPointerException() {
        Map<String, String> options = Map.of();
        assertThrows(NullPointerException.class, () -> formatter.init(options, null));
    }

    @Test
    public void doFormat_NullCode_ThrowsNullPointerException() {
        LineEnding ending = new LineEnding() {
            @Override
            public String getLineEnding() {
                return "\n";
            }
        };
        assertThrows(NullPointerException.class, () -> formatter.doFormat(null, ending));
    }

}