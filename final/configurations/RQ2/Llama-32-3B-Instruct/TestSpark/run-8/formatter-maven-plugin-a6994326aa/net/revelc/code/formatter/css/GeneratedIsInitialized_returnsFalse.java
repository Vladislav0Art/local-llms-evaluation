package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedIsInitialized_returnsFalse {

    public void setUp() {
    }

    @Test
    public void isInitialized_returnsFalse() {
        boolean result = new CssFormatter().isInitialized();
        assertEquals(false, result);
    }
}

class MockConfigurationSource implements java.util.ConfigurationSource {

    private String options;

    public MockConfigurationSource(String options) {
        this.options = options;
    }

    @Override
    public java.util.Map<String, Object> getProperties() throws IOException {
        return new HashMap<>();
    }

    @Override
    public String getName() {
        return null;
    }

}