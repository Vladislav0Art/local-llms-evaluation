package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDoFormat_testIOException {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void testDoFormat_testIOException() throws IOException {
        // given
        String code = "body { color: #333; }";
        LineEnding ending = LineEnding.LF;
        // when
        formatter.doFormat(code, ending);
    }

}