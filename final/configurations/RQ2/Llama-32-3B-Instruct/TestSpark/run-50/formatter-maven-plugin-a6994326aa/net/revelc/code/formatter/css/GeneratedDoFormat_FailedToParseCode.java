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
public class GeneratedDoFormat_FailedToParseCode {

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
    public void doFormat_FailedToParseCode() {
        // Given:
        final String parsedCss = "";

        TestConfigurationSource cfgMock = new TestConfigurationSource();
        when(cfg.getOptions()).thenReturn(new HashMap<>());
        when(cfg.parse(parsedCss)).thenReturn(parsedCss);

        // When:
        CssFormatter formatter = new TestCssFormatter();
        final String expected = "";

        // Then:
        assertEquals(expected, formatter.doFormat(code, ending));
    }

}