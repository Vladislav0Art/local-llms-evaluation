package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.io.StringReader;
import java.io.StringWriter;

public class GeneratedFromClasspathCharsetTest {

    @Test
    public void fromClasspathCharsetTest() {
        assertNotNull(WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8));
    }

}