package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized_ReturnsTrue {

    @Mock
    private CSSFormat format;

    @Mock
    private ConfigurationSource cfg;

    private CssFormatter formatter;

    public CssFormatter() {
        this.formatter = new CssFormatter();
        this.formatter.setFormat(format);
        this.formatter.setConfigurationSource(cfg);
    }

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isInitialized_ReturnsTrue() {
        assertTrue(formatter.isInitialized());
    }
}

public class CssFormatter {
    private CSSFormat format;
    private ConfigurationSource cfg;

    public CssFormatter() {
    }

    public boolean init(Map<String, String> options, ConfigurationSource cfg) { /* implementation */ }

    public String doFormat(String code, LineEnding ending) throws IOException { /* implementation */ }

    public boolean isInitialized() { /* implementation */ }
}

public class CSSFormat {
    // method to format css
}

public class ConfigurationSource {
    // method to configure
}

}