package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("Sample text".getBytes(StandardCharsets.UTF_8));
        assertNotNull(WordWrap.fromUtf8(in));
    }

}