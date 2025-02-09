package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        Builder builder = WordWrap.from(new File("test.file"), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}