package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Set;

public class GeneratedIsWhitespace_returnTrueIfEmptyOrWhiteSpaces {

    @Test
    public void isWhitespace_returnTrueIfEmptyOrWhiteSpaces() {
        // given
        CharSequence text = new StringBuilder("");
        CharSequence nonWhiteSpaces = new StringBuilder("Hello World");

        // when
        boolean result1 = WordWrap.isWhitespace(text);
        boolean result2 = WordWrap.isWhitespace(nonWhiteSpaces);

        // then
        assertTrue(result1);
        assertFalse(result2);
    }

}