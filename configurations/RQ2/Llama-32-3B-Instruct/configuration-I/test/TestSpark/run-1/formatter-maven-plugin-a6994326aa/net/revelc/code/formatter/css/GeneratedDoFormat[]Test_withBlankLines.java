package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormat[]

Test_withBlankLines {

    private CssFormatter formatter;

    @Test
    public void doFormat[] Test_withBlankLines() throws IOException {
        // given
        String code = "body { color: #333; }\n\ndiv { display: inline; }";
        LineEnding ending = LineEnding.LF;
        // when
        String formattedCode = formatter.doFormat(code, ending);
        // then
        assertNotNull(formattedCode);
    }

}