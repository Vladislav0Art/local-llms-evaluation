package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        Builder builder = WordWrap.fromClasspath("/sample.txt", StandardCharsets.UTF_8);
        assertTrue(builder instanceof Builder);
    }

}