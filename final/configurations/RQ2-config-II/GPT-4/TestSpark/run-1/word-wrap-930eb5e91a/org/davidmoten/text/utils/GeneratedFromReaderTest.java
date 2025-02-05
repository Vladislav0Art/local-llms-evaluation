package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Builder builder = WordWrap.from(new StringReader("Hello, world!"));
        assertTrue(builder instanceof Builder);
    }

}