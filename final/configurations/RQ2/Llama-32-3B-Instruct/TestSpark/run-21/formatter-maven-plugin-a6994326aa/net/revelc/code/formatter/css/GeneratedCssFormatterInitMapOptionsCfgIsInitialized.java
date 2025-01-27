package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedCssFormatterInitMapOptionsCfgIsInitialized {

    @Test
    public void cssFormatterInitMapOptionsCfgIsInitialized() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertThat(formatter.isInitialized(), Is.is(true));
    }

}