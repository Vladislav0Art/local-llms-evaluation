package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedWordWrapReaderWriterTest {

    @Test
    public void wordWrapReaderWriterTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(outContent, StandardCharsets.UTF_8);
        String newLine = "\n";
        Number maxWidth = 20;
        Function<String, Number> stringWidth = (s) -> s.length();
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(new MockReader("Hello World"), writer, newLine, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
        Preconditions.assertNotNull(outContent.toString());
    }

}