package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedIsInitializedFalseTest {

    @Test
    public void isInitializedFalseTest() {
        CssFormatter formatter = mock(CssFormatter.class);
        when(formatter.init(any(), any())).thenThrow(IOException::new);
        assertFalse(formatter.isInitialized());
    }
}

class ConfigurationSource {
    private Map<String, String> options;

    public Map<String, String> getOptions() {
        return options;
    }

    void setOptions(Map<String, String> options) {
        this.options = options;
    }
}

class LineEnding {
    public static final String LF = "\n";

    public String getValue() {
        return LF;
    }

}