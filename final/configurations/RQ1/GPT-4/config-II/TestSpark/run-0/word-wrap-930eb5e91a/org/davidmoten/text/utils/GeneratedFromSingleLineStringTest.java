package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedFromSingleLineStringTest {

    @Test
    public void fromSingleLineStringTest() {
        String input = "Hello world!";
        String output = WordWrap.from(input).wrap();
        assertEquals("Hello\nworld!", output);
    }

}