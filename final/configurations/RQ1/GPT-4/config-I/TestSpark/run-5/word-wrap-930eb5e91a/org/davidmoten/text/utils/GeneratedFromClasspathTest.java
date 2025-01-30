package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("test", StandardCharsets.UTF_8);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

}