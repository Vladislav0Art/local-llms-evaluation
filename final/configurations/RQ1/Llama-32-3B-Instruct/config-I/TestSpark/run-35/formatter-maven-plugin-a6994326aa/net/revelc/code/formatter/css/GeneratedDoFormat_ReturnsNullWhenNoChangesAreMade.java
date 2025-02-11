package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedDoFormat_ReturnsNullWhenNoChangesAreMade {

    @Test
    public void doFormat_ReturnsNullWhenNoChangesAreMade() {
        // given
        String code = "body { color: red; }";
        LineEnding ending = null;
        String expectedOutput = "body { color: red; }";

        // when
        String formattedCode = cssFormatter.doFormat(code, ending);

        // then
        assertNull(formattedCode);
    }

}