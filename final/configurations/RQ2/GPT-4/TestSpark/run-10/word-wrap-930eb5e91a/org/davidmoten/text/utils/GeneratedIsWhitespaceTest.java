package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedIsWhitespaceTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace("   "));
        assertFalse(WordWrap.isWhitespace("test   "));
    }

}