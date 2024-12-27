package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormat[]

Test {

    private CssFormatter formatter;

    @Test
    public void doFormat[] Test() throws IOException {
        // given
        String code = "body { color: #333; }";
        LineEnding ending = LineEnding.LF;
        // when
        String formattedCode = formatter.doFormat(code, ending);
        // then
        assertNotNull(formattedCode);
    }

}