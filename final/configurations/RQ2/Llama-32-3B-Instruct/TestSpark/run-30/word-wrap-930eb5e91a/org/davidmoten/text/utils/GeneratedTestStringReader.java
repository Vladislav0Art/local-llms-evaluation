package org.davidmoten.text.utils;

import static org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTestStringReader {

    @Test
    public void testStringReader() throws Exception {
        String text = "Hello\nWorld";
        try (LineReader reader = new LineReader(new BufferedReader(new FileReader(text)))) {
            int lineCount = 0;
            while (reader.readNext()) {
                ++lineCount;
            }
            assertEquals(2, lineCount);
        }
    }

}