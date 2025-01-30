package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedNewLineTest {

    @Test
    public void newLineTest() {
        String result = WordWrap.from("This is a sample text.\nThis is a second line.").newLine("--").wrap();
        assertTrue(result.contains("--"));
    }

}