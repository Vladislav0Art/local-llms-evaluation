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
public class GeneratedTest {

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
    public void init_CalledWhenInitializationIsEnabled() {
        // Given:
        final boolean initializationEnabled = true;
        TestConfigurationSource cfgMock = new TestConfigurationSource();
        cfg.setOptions(new HashMap<>());

        // When:
        CssFormatter formatter = new TestCssFormatter();
        formatter.init(cfg, cfgMock);

        // Then:
        assertTrue(initializationEnabled);
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

    @Test
    public void doFormat_ParsedSuccessfully() {
        // Given:
        final String parsedCss = "body { color: red; }";
        TestConfigurationSource cfgMock = new TestConfigurationSource();
        when(cfg.getOptions()).thenReturn(new HashMap<>());
        when(cfg.parse(parsedCss)).thenReturn(parsedCss);

        // When:
        CssFormatter formatter = new TestCssFormatter();
        final String expected = "body { color: red; }";

        // Then:
        assertEquals(expected, formatter.doFormat(code, ending));
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