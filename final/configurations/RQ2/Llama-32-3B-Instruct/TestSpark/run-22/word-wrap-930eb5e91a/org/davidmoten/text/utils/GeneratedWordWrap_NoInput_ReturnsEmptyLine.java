package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedWordWrap_NoInput_ReturnsEmptyLine {

    @Test
    public void wordWrap_NoInput_ReturnsEmptyLine() throws IOException {
        Reader in = Mockito.mock(BufferedReader.class);
        PrintWriter out = new PrintWriter(new StringWriter());
        WordWrap.wordWrap(in, out, "\n", 10L, Mockito.any(), Mockito.emptySet(),
                false, false);
        assertTrue(out.toString().equals("\n"));
    }

}