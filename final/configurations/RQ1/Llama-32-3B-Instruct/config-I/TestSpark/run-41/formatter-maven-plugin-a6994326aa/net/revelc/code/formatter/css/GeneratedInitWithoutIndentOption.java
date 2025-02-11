package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitWithoutIndentOption {

    @Test
    public void initWithoutIndentOption() {
        final var options = Map.of("rgbAsHex", Boolean.TRUE.toString());
        final var cfg = ConfigurationSource.create();
        new CssFormatter().init(options, cfg);
    }

}