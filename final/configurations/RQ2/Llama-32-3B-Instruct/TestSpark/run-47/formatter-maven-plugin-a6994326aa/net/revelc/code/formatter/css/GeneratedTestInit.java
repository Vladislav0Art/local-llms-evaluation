package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestInit {

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
    public void testInit() {
        Map<String, String> options = new HashMap<>();
        new CssFormatter().init(options, configurationSource);
    }
}

class CssFormatter {

    private LineEnding lineEnding;

    public void init(Map<String, String> options, ConfigurationSource configurationSource) {
        this.lineEnding = LineEnding.LF;
    }

    public String doFormat(String code, LineEnding lineEnding) {
        return code.replace("\r\n", lineEnding.getValue());
    }
}

class ConfigurationSource {

    private String css;

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

}