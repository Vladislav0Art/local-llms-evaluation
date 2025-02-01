package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("/test.txt");
        assertEquals("abc", builder.wrap());
    }

}