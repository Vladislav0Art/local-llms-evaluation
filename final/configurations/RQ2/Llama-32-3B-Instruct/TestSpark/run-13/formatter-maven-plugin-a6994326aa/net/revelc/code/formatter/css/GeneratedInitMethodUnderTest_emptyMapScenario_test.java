package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedInitMethodUnderTest_emptyMapScenario_test {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initMethodUnderTest_emptyMapScenario_test() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        try {
            formatter.init(options, cfg);
            assert false : "Expected exception was not thrown";
        } catch (Exception e) {
            assertTrue(false, e instanceof UnsupportedOperationException);
        }
    }

}