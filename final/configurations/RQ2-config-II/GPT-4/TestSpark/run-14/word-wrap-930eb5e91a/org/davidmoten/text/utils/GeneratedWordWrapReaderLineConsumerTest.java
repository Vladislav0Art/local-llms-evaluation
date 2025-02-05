package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GeneratedWordWrapReaderLineConsumerTest {

    @Test
    public void wordWrapReaderLineConsumerTest() throws IOException {
        Reader in = new StringReader("Testing wordWrap method.");
        WordWrap.wordWrap(in, System.out::println, 10,
                CharSequence::length, new HashSet<>(), false, false);
    }

}