package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspath("test-resource", StandardCharsets.UTF_8).getClass());
    }

}