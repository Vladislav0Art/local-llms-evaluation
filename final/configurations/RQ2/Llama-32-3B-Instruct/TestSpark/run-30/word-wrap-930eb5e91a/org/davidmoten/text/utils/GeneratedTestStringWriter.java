package org.davidmoten.text.utils;

import static org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTestStringWriter {

    @Test
    public void testStringWriter() throws Exception {
        try (LineWriter writer = new LineWriter(new java.io.StringWriter())) {
            writer.addLine("Hello\nWorld");
            String output = writer.toString();
            assertTrue(output.contains("Hello"));
            assertTrue(output.contains("\nWorld"));
        }
    }

}