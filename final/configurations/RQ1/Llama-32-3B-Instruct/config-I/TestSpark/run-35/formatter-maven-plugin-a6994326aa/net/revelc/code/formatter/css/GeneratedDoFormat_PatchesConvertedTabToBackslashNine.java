package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

public class GeneratedDoFormat_PatchesConvertedTabToBackslashNine {

    @Test
    public void doFormat_PatchesConvertedTabToBackslashNine() {
        // given
        String code = "body { color: red;\t }";
        LineEnding ending = null;

        // when
        String formattedCode = cssFormatter.doFormat(code, ending);

        // then
        assertEquals("body { color: red;\\9 }", formattedCode);
    }

}