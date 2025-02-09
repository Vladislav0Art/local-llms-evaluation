package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        Builder builder = WordWrap.fromClasspath("testResource", StandardCharsets.UTF_8);
        assertNotNull("Builder object should not be null", builder);
    }

}