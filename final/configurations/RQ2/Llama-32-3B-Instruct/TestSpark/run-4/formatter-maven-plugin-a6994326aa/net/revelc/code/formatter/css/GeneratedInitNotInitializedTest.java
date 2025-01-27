package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Map;

public class GeneratedInitNotInitializedTest {

    @Test
    public void initNotInitializedTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        try {
            formatter.init(options, cfg);
            assert false : "Expected an exception to be thrown.";
        } catch (IOException e) {
            assertThat(e.getMessage(), is("Formatter not initialized"));
        }
    }

}