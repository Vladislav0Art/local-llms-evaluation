package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("/test.txt", StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}