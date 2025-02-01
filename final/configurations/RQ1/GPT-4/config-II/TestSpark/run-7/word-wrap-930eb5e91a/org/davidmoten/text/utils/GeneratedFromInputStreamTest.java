package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        InputStream in = new ByteArrayInputStream("Test InputStream".getBytes());
        assertNotNull(WordWrap.fromUtf8(in));
    }

}