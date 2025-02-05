package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GeneratedFromUtf8InputStreamTest {

    @Test
    public void fromUtf8InputStreamTest() {
        InputStream inputStream = new ByteArrayInputStream("Testing fromUtf8 method.".getBytes());
        WordWrap.Builder builder = WordWrap.fromUtf8(inputStream);
        assertNotNull(builder);
    }

}