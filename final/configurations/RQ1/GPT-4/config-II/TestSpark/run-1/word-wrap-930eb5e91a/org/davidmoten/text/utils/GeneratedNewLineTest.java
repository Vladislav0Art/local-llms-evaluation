package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedNewLineTest {

    @Test
    public void newLineTest() {
        StringReader reader = new StringReader("Test Text");
        assertNotNull(WordWrap.from(reader).newLine("\n"));
    }

}