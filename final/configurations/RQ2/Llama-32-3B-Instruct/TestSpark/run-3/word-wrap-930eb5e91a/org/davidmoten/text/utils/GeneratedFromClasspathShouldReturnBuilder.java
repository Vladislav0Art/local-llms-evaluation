package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromClasspathShouldReturnBuilder {

    @Test
    public void fromClasspathShouldReturnBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspath("Hello World");
        assertNotNull(builder);
    }

}