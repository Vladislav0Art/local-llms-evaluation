package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

public class GeneratedDoFormat_SomethingElseTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormat_SomethingElseTest() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF;
        assertNull(formatter.doFormat("Invalid CSS", ending));
    }

}