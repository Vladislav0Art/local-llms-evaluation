package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import org.junit.Test;

public class GeneratedFromCharsetTest {

    @Test
    public void fromCharsetTest() {
        InputStream testInput = new ByteArrayInputStream("test".getBytes(StandardCharsets.UTF_8));
        assertTrue(WordWrap.from(testInput, StandardCharsets.UTF_8) instanceof WordWrap.Builder);
    }

}