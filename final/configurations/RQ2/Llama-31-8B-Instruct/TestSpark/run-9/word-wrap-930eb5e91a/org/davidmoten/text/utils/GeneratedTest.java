package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "test.txt";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertNotNull(builder);
    }

    @Test
    public void fromTextTest() {
        String text = "Hello World!";
        WordWrap.Builder builder = WordWrap.from(text);
        assertNotNull(builder);
    }

}