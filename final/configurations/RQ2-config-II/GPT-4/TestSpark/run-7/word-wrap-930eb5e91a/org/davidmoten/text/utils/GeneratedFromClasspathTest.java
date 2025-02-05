package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("\\resources\\testResource", StandardCharsets.UTF_8);

        assertEquals(WordWrap.Builder.class, builder.getClass());
    }

}