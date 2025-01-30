package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedBreakWordsWrapTest {

    @Test
    public void breakWordsWrapTest() {
        Reader input = new StringReader("This is a test for breaking words.");

        String wrappedText = WordWrap.from(input)
                .maxWidth(10)
                .breakWords(true)
                .wrap();

        assertEquals("This is a\ntest for\nbreaking\nwords.", wrappedText);
    }

}