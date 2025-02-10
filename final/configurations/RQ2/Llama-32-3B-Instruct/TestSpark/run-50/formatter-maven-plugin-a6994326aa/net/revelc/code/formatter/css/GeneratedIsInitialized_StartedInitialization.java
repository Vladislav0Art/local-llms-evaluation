package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RunWith(PowerMockRunner.class)
public class GeneratedIsInitialized_StartedInitialization {

    private static class TestConfigurationSource {
        private Map<String, String> options = new HashMap<>();
        private boolean isInitialized = false;

        public void setOptions(Map<String, String> options) {
            this.options = options;
        }

        public boolean getInitCallCount() {
            return isInitialized ? 1 : 0;
        }

        public void init() {
            isInitialized = true;
        }
    }

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private String code;

    @Mock
    private LineEnding ending;

    private CssFormatter formatter;

    public CssFormatterTest() {
    }

    public static class TestCssFormatter extends CssFormatter {

    }

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(cfg.getOptions()).thenReturn(new HashMap<>());
    }

    @Test
    public void isInitialized_StartedInitialization() {
        // Given:
        TestConfigurationSource cfgMock = new TestConfigurationSource();
        cfgMock.init();

        // When:
        // No-op

        // Then:
        assertTrue(CssFormatter.class.cast(formatter).isInitialized);
    }

}