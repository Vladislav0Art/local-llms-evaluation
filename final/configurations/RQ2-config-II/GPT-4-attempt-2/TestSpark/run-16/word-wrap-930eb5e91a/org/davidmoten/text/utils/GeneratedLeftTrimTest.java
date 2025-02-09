package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("  text  ");
        WordWrap.leftTrim(word);
        assertEquals("text  ", word.toString());
    }

}