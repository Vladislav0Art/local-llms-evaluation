package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamCharSetTest {

    @Test
    public void fromInputStreamCharSetTest() {
        InputStream in = new ByteArrayInputStream("Test".getBytes());
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

}