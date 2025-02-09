package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

}