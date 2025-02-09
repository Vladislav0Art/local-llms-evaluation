package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromInputStreamAndCharsetTest {

    @Test
    public void fromInputStreamAndCharsetTest() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

}