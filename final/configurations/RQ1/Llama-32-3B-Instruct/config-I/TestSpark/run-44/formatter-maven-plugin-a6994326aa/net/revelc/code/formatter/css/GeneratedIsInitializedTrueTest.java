package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.Map;

public class GeneratedIsInitializedTrueTest {

    @Test
    public void isInitializedTrueTest() {
        Map<String, String> options = Map.of("indent", "4");
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }

}