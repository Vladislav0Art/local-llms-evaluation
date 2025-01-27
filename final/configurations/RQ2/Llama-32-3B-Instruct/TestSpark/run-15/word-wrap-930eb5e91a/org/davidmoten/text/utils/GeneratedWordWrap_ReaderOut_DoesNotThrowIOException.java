package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedWordWrap_ReaderOut_DoesNotThrowIOException {

    @Test
    public void wordWrap_ReaderOut_DoesNotThrowIOException() throws IOException {
        WordWrap.wordWrap(null, null, "\n", 10L, String::length, new HashSet<>(), false, false);
    }

}