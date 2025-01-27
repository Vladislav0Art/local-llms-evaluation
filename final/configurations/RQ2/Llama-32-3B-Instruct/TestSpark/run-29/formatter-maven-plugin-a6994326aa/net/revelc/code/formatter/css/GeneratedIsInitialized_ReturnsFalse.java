package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized_ReturnsFalse {

    private static final String CSS_SOURCE = "body { background-color: red; }";

    @Mock
    private ConfigurationSource configurationSource;

    @Mock
    private Map<String, String> options;

    public LineEnding getLineEnding() {
        return new LineEnding();
    }

    public class LineEnding {
        public static final String LF = "\n";
    }

    @Test
    public void isInitialized_ReturnsFalse() {
        boolean result = new CssFormatter().isInitialized();
        assert (!result);
    }

}