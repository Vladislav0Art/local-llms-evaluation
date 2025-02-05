package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        assertTrue(WordWrap.fromUtf8(System.in).getClass().getName().contains("Builder"));
    }

}