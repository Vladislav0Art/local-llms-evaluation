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
public class GeneratedIsInitialized_InitNotCalled {

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
    public void isInitialized_InitNotCalled() {
        // Given:
        final boolean initCalled = false;
        TestConfigurationSource cfgMock = new TestConfigurationSource();
        when(cfg.getInitCallCount()).thenReturn(initCalled);

        // When and Then:
        CssFormatter formatter = new TestCssFormatter();
        assertFalse(formatter.isInitialized());
    }

}