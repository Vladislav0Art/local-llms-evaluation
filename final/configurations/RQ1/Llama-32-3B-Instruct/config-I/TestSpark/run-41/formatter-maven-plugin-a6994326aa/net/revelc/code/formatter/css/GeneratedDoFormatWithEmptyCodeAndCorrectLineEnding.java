package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatWithEmptyCodeAndCorrectLineEnding {

    @Test
    public void doFormatWithEmptyCodeAndCorrectLineEnding() throws IOException {
        final var code = "";
        final var formatter = new CssFormatter().init(Map.of("indent", "4"), ConfigurationSource.create());
        assertEquals(code, formatter.doFormat(code, LineEnding.NEWLINE));
    }

}