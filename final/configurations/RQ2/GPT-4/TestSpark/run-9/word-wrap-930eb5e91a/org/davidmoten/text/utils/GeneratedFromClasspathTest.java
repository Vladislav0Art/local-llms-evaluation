package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        assertNotNull(WordWrap.fromClasspath("resource.txt", Charset.defaultCharset()));
    }

}