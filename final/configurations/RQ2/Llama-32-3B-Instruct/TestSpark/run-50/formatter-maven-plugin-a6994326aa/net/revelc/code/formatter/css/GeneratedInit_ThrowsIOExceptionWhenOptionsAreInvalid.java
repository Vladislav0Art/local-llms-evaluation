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
public class GeneratedInit_ThrowsIOExceptionWhenOptionsAreInvalid {

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
    public void init_ThrowsIOExceptionWhenOptionsAreInvalid() {
        // Given:
        final Map<String, String> options = new HashMap<>();
        options.put("invalidOption", "value");
        cfg.setOptions(options);

        TestConfigurationSource cfgMock = new TestConfigurationSource();
        when(cfg.getOptions()).thenReturn(options);

        // When and Then:
        CssFormatter formatter = new TestCssFormatter();
        assertFalse(formatter.init(null, cfg));
        assertTrue(cfgMock.getInitCallCount() == 1);
    }

}