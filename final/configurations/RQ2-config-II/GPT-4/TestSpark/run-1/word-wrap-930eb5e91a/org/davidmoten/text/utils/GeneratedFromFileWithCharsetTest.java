package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedFromFileWithCharsetTest {

    @Test
    public void fromFileWithCharsetTest() {
        Builder builder = WordWrap.from(new File("./"), StandardCharsets.UTF_8);
        assertTrue(builder instanceof Builder);
    }

}