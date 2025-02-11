package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedDoFormat_ReturnsFormattedCssText {

    @Test
    public void doFormat_ReturnsFormattedCssText() {
        // given
        String code = "body { color: red; }";
        LineEnding ending = null;

        // when
        String formattedCode = cssFormatter.doFormat(code, ending);

        // then
        assertTrue(formattedCode.contains("color: red;"));
    }

}