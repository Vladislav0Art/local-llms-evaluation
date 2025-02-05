package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedIsWhitespaceCharSequenceTest {

    @Test
    public void isWhitespaceCharSequenceTest() {
        CharSequence charSequence = new StringBuilder("  ");
        assertTrue(WordWrap.isWhitespace(charSequence));
    }

}