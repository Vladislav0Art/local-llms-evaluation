package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedIsWhitespace_NoWhitespaceCharacters {

    @Test
    public void isWhitespace_NoWhitespaceCharacters() {
        assertFalse(WordWrap.isWhitespace(""));
    }

}