package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedIsWhitespaceFailsTest {

    @Test
    public void isWhitespaceFailsTest() {
        CharSequence sequence = "  no  ";
        assertFalse(WordWrap.isWhitespace(sequence));
    }

}