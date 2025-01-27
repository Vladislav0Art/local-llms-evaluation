package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedIsInitializedMethodUnderTest_initializationScenario_test {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void isInitializedMethodUnderTest_initializationScenario_test() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        try {
            boolean result = formatter.isInitialized();
            assert result == false;
        } catch (Exception e) {
            assertTrue(false, e instanceof UnsupportedOperationException);
        }
    }

}