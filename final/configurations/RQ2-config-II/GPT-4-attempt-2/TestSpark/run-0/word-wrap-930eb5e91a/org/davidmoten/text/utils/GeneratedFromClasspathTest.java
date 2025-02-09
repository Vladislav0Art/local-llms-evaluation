package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8));
    }

}