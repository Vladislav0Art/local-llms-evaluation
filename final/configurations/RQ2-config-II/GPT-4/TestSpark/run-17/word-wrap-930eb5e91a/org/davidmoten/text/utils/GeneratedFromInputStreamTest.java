package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        assertNotNull(WordWrap.from(new ByteArrayInputStream(new byte[0]), StandardCharsets.UTF_8));
    }

}