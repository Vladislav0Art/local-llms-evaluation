package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;

public class GeneratedWordWrap_readerWriter_throwsIOException_whenInsertHyphensFalse {

    @Test
    public void wordWrap_readerWriter_throwsIOException_whenInsertHyphensFalse() throws IOException {
        WordWrap wordWrap = WordWrap.wordWrap(new StringReader("Hello World"), new ByteArrayOutputStream(), "\n", 10, s -> 10, null, false, true);
        assertEquals(1, wordWrap.getLineWidth());
    }

}