package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTest {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatTest() throws IOException {
        var code = "h1 { color: red; }";
        var formattedCode = cssFormatter.doFormat(code, LineEnding.LF);
        Assertions.assertNotNull(formattedCode);
    }

}