package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromClasspathCharsetStreamTest {

    @Test
    public void fromClasspathCharsetStreamTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("/myResource", StandardCharsets.UTF_8);
        assertTrue(builder instanceof WordWrap.Builder);
    }

}