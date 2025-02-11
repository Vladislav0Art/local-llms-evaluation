package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.Map;

public class GeneratedInitInvalidIndentTest {

    @Test
    public void initInvalidIndentTest() throws IOException {
        Map<String, String> options = Map.of("indent", "-1");
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.init(options, cfg));
    }

}