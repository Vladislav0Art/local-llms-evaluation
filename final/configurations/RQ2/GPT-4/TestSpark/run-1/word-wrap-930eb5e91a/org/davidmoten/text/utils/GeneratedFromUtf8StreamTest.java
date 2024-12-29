package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.StringWriter;

public class GeneratedFromUtf8StreamTest {

    @Test
    public void fromUtf8StreamTest() {
        assertNotNull(WordWrap.fromUtf8(System.in));
    }

}