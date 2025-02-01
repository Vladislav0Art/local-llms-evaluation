package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedFromStreamTest {

    @Test
    public void fromStreamTest() {
        InputStream in = new ByteArrayInputStream("Hello world!".getBytes());
        String output = WordWrap.from(in, Charset.defaultCharset()).wrap();
        assertEquals("Hello\nworld!", output);
    }

}