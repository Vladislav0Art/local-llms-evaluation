package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedIsInitializedWithoutInitializedFormatter {

    @Test
    public void isInitializedWithoutInitializedFormatter() {
        final var formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}