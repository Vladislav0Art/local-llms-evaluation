package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsInitializedReturnsTrueAfterInit {

    @Test
    public void isInitializedReturnsTrueAfterInit() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        boolean result = formatter.isInitialized();
        assert result;
    }
}

class ConfigurationSource {
    public static class Mock extends ConfigurationSource {
        @Override
        public void setOption(String key, String value) {
        }
    }

}