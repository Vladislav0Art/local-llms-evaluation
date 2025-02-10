package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestFormat {

    @Mock
    private ConfigurationSource configurationSource;

    public void setup() {
        Mockito.when(configurationSource.getCss()).thenReturn("");
    }

    public enum LineEnding {
        LF, CRLF

        public String getValue() {
            switch (this) {
                case LF:
                    return "\n";
                case CRLF:
                    return "\n\r";
                default:
                    throw new RuntimeException();
            }
        }
        }

    @Test
    public void testFormat() {
        String code = "body { background-color: blue; }";
        new CssFormatter().init(new HashMap<>(), configurationSource);
        String actual = new CssFormatter().doFormat(code, LineEnding.LF.getValue());
        assertEquals("body { background-color: blue; }\n", actual);
    }

}