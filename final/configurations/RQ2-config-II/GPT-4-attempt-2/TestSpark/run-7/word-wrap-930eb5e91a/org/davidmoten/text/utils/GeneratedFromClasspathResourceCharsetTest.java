package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromClasspathResourceCharsetTest {

    @Test
    public void fromClasspathResourceCharsetTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("classpath:resources/test.txt", StandardCharsets.UTF_8);
        assertTrue(builder instanceof WordWrap.Builder);
    }

}