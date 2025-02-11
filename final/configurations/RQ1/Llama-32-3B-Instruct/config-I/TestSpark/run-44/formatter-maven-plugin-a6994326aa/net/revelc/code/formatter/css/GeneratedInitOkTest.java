package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.Map;

public class GeneratedInitOkTest {

    @Test
    public void initOkTest() {
        Map<String, String> options = Map.of("indent", "4");
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        assertThat(formatter.init(options, cfg), is(true));
    }

}