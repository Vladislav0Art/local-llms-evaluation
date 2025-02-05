package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromUtf8InputStreamTest {

    @Test
    public void fromUtf8InputStreamTest() {
        InputStream in = new ByteArrayInputStream("Test".getBytes());
        assertNotNull(WordWrap.fromUtf8(in));
    }

}