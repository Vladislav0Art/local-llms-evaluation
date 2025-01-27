package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedInitMethodUnderTest_nonEmptyMapScenario_test {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initMethodUnderTest_nonEmptyMapScenario_test() {
        Map<String, String> options = new HashMap<>();
        options.put("option", "value");
        ConfigurationSource cfg = null;
        try {
            formatter.init(options, cfg);
            assert false : "Expected exception was not thrown";
        } catch (Exception e) {
            assertTrue(false, e instanceof UnsupportedOperationException);
        }
    }

}