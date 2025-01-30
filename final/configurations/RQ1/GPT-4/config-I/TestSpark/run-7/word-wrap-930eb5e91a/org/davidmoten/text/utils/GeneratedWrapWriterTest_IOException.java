package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

public class GeneratedWrapWriterTest_IOException {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void wrapWriterTest_IOException() {
        StringReader reader = new StringReader("Some input string");
        Writer writer = new Writer() {
            @Override
            public void close() throws IOException {
                throw new IOException();
            }

            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
            }

            public void flush() throws IOException {
            }
        };
        expectedEx.expect(RuntimeException.class);
        WordWrap.from(reader).wrap(writer);
    }

}