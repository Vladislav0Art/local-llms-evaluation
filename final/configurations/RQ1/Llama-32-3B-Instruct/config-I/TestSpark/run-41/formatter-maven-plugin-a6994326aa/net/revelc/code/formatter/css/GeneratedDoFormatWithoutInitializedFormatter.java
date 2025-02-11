package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatWithoutInitializedFormatter {

    @Test
    public void doFormatWithoutInitializedFormatter() throws IOException {
        final var formatter = new CssFormatter();
        assertThrows(IOException.class, () -> formatter.doFormat("body { color: blue; }", LineEnding.NEWLINE));
    }

}