package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedReplaceNewLineTest {

    @Test
    public void replaceNewLineTest() {
        String input = "Hello world!";
        String output = WordWrap.from(input).newLine("\r\n").wrap();
        assertTrue(output.contains("\r\n"));
    }

}