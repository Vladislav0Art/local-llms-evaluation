package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        CharSequence text = "          ";
        assertEquals(WordWrap.isWhitespace(text), true);
        text = "Hello World";
        assertEquals(WordWrap.isWhitespace(text), false);
    }

}