package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;
import java.io.IOException;

import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;

public class GeneratedIsInitialized_false_test {

    @Test
    public void isInitialized_false_test() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }
}

public class LineEnding {

    public static final LineEnding LF = new LineEnding();

    private LineEnding() {
    }

    @Override
    public String toString() {
        return "\n";
    }

    public enum LineEnding {
        LF, CRLF;
    }

}