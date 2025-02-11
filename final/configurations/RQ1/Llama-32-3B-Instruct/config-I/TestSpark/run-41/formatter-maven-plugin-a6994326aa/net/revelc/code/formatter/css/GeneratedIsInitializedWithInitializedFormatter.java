package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedIsInitializedWithInitializedFormatter {

    @Test
    public void isInitializedWithInitializedFormatter() {
        final var formatter = new CssFormatter().init(Map.of(), ConfigurationSource.create());
        assertTrue(formatter.isInitialized());
    }

}