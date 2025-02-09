package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromClasspathUtf8ResourceTest {

    @Test
    public void fromClasspathUtf8ResourceTest() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("classpath:resources/test.txt");
        assertTrue(builder instanceof WordWrap.Builder);
    }

}