package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() throws IOException {
        WordWrap.Builder builder =
                WordWrap.from(getClass().getResourceAsStream("test.txt"), StandardCharsets.UTF_8);
        assertTrue(builder instanceof WordWrap.Builder);
    }

}