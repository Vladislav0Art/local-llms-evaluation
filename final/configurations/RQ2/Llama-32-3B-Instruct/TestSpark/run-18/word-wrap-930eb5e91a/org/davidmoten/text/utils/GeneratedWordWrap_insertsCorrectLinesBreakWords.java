package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Set;

public class GeneratedWordWrap_insertsCorrectLinesBreakWords {

    @Test
    public void wordWrap_insertsCorrectLinesBreakWords() throws IOException {
        // given
        String text = "Hello World, this is a test.";
        WordWrap.Builder builder = WordWrap.from(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);

        // when
        WordWrap.wordWrap(builder.build().getReader(), writer, "\n", 10,
                (s) -> s.length(),
                Set.of(' '),
                true,
                true);

        // then
        String expected = "Hello\nWorld,\nthis is a test.";
        assertEquals(expected, out.toString());
    }

}