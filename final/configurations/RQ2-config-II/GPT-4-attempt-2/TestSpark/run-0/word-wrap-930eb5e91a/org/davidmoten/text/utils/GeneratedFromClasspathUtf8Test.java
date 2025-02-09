package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        assertNotNull(WordWrap.fromClasspathUtf8("test.txt"));
    }

}