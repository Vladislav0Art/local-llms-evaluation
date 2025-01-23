package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        String resource = "test.txt";
        Charset charset = StandardCharsets.UTF_8;
        WordWrap.Builder builder = WordWrap.fromClasspath(resource, charset);
        assertNotNull(builder);
    }

}