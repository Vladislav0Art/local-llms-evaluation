package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatWithInvalidCodeAndCorrectLineEnding {

    @Test
    public void doFormatWithInvalidCodeAndCorrectLineEnding() throws IOException {
        final var code = " invalid";
        final var formatter = new CssFormatter().init(Map.of("indent", "4"), ConfigurationSource.create());
        assertThrows(IOException.class, () -> formatter.doFormat(code, LineEnding.NEWLINE));
    }

}