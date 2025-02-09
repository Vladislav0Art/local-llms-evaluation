package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        Builder builder = WordWrap.fromClasspath("", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}