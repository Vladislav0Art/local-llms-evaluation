package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedInit_NullOptions_ThrowsIOException {

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
    public void init_NullOptions_ThrowsIOException() throws IOException {
        Mockito.when(configurationSourceMock().getOptions()).thenReturn(options);
        Mockito.when(options.isEmpty()).thenThrow(IOException.class);
        CssFormatter cssFormatter = new CssFormatter();
        boolean result = cssFormatter.init(options, configurationSourceMock());
        assert (result);
    }

}