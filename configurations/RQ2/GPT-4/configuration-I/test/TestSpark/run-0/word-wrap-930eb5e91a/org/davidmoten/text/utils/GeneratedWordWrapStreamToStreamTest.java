package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapStreamToStreamTest {

    @Mock
    Reader reader;

    @Mock
    Writer writer;

    @Test
    public void wordWrapStreamToStreamTest() {
        try {
            WordWrap.wordWrap(reader, writer, "\n", 80, CharSequence::length, new HashSet<>(), false, false);
            verify(reader, times(1)).read();
            verify(writer, times(1)).write(anyString());
        } catch (IOException e) {
            fail("IOException was thrown");
        }
    }

}