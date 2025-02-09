package org.davidmoten.text.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        boolean result = WordWrap.isWhitespace("   ");
        assertTrue(result);
    }

}