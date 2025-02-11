package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.Map;

public class GeneratedInitRgbAsHexFalseTest {

    @Test
    public void initRgbAsHexFalseTest() {
        Map<String, String> options = Map.of("rgbAsHex", Boolean.FALSE.toString());
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        assertThat(formatter.init(Map.of(), options, cfg), is(true));
    }

}