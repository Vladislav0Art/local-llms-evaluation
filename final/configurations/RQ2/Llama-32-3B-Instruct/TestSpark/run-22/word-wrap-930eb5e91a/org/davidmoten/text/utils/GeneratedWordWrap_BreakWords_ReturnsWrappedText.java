package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedWordWrap_BreakWords_ReturnsWrappedText {

    @Test
    public void wordWrap_BreakWords_ReturnsWrappedText() throws IOException {
        Reader in = new BufferedReader(new FileReader("test.txt"));
        PrintWriter out = new PrintWriter(new StringWriter());
        WordWrap.wordWrap(in, out, "\n", 10L, Mockito.any(), Mockito.emptySet(),
                true, false);
        assertNotNull(out.toString());
    }

}