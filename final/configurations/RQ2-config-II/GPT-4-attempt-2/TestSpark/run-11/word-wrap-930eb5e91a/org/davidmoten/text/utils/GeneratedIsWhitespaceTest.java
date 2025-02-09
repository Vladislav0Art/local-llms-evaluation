package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        assertTrue(WordWrap.isWhitespace(" "));
        assertFalse(WordWrap.isWhitespace("not empty string"));
    }

}