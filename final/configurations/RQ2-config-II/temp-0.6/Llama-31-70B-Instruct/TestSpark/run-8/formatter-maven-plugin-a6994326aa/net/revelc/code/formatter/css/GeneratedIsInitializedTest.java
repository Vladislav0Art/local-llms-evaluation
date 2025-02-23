package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = mock(Map.class);
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        boolean initialized = cssFormatter.isInitialized();
        assertTrue(initialized);
    }

}