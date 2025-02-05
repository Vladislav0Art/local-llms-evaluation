package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        ByteArrayInputStream testInput = new ByteArrayInputStream("Test string".getBytes());
        assertNotNull(WordWrap.fromUtf8(testInput));
    }

}