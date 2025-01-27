package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedDoFormat_ComplexString_ReturnsFormattedString {

    private static final String CSS_SOURCE = "body { background-color: red; }";

    @Mock
    public ConfigurationSourceConfigurationSourceMock configurationSourceMock();

    @Mock
    public Map<String, String> options;

    public LineEnding getLineEnding() {
        return new LineEnding();
    }

    public class LineEnding {
        public static final String LF = "\n";
    }

    public class CssFormatter {
        public boolean init(Map<String, String> options, ConfigurationSource configurationSource) {
            return true;
        }

        public String doFormat(String code, LineEnding lineEnding) {
            return "";
        }
    }

    @Test
    public void doFormat_ComplexString_ReturnsFormattedString() {
        String code = CSS_SOURCE + "\ndiv { color: blue; }";
        LineEnding lineEnding = getLineEnding();
        String expected = "body {\n  background-color: red;\n}\ndiv {\n  color: blue;\n}";
        String actual = new CssFormatter().doFormat(code, lineEnding);
        assert (actual.equals(expected));
    }

}