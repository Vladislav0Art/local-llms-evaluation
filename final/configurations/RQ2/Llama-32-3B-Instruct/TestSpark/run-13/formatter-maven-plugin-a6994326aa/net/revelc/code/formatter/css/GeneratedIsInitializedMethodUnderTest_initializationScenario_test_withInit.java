package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedIsInitializedMethodUnderTest_initializationScenario_test_withInit {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void isInitializedMethodUnderTest_initializationScenario_test_withInit() throws IOException {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        formatter.init(options, cfg);
        boolean result = formatter.isInitialized();
        assert result == true;
    }

}