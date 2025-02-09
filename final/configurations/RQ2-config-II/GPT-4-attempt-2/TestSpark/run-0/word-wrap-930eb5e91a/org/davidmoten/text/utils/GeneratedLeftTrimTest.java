package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 word = new StringBuilder2("   This is a unit test");
        WordWrap.leftTrim(word);
        assertEquals("This is a unit test", word.toString());
    }

}