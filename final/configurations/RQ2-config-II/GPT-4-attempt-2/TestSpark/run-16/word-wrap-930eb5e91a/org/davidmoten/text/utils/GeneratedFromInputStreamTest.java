package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() {
        Builder builder = WordWrap.from(null, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}