package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        InputStream in = new ByteArrayInputStream("Test Data".getBytes());
        WordWrap.Builder builder = WordWrap.from(in, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}