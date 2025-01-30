package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedFromClasspathWrapTest {

    @Test
    public void fromClasspathWrapTest() {
        String classpathResource = "/file.txt";

        String wrappedText = WordWrap.fromClasspath(classpathResource, StandardCharsets.UTF_8)
                .maxWidth(10)
                .wrap();

        assertEquals("Expected text after wrapping", wrappedText);
    }

}