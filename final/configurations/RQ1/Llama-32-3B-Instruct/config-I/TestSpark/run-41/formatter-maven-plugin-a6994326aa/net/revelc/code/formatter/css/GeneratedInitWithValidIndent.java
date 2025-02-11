package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitWithValidIndent {

    @Test
    public void initWithValidIndent() {
        final var options = Map.of("indent", "4");
        final var cfg = ConfigurationSource.create();
        new CssFormatter().init(options, cfg);
    }

}