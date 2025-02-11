package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitWithInvalidIndent {

    @Test
    public void initWithInvalidIndent() {
        final var options = Map.of("indent", "invalid");
        final var cfg = ConfigurationSource.create();
        assertThrows(IOException.class, () -> new CssFormatter().init(options, cfg));
    }

}