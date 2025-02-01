package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("test", StandardCharsets.UTF_8));
    }

}