package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.Map;

public class GeneratedTest {

    public static class ConfigurationSource {
        public Map<String, String> getOptions() throws IOException {
        }
    }

    @Mock
    private ConfigurationSource cfg;

    public CssFormatter testConfigurationSource() {
        return new CssFormatter();
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

}