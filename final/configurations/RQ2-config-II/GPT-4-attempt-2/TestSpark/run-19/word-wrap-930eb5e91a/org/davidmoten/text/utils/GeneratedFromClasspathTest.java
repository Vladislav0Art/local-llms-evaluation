package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("res/sample.txt", StandardCharsets.UTF_8));
    }

}