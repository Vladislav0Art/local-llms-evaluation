package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        String text = "Hello World";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(text.getBytes());

        assertEquals(WordWrap.from(byteArrayInputStream, StandardCharsets.UTF_8), WordWrap.from(text));
    }

}