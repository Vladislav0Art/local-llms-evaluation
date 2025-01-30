package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedMaxWidthAndNewlineWrapTest {

    @Test
    public void maxWidthAndNewlineWrapTest() {
        Reader input = new StringReader("This is a test for max width and new line.");

        String wrappedText = WordWrap.from(input)
                .maxWidth(20)
                .newLine("\r\n")
                .wrap();

        assertEquals("This is a test for\r\nmax width and new\r\nline.", wrappedText);
    }

}