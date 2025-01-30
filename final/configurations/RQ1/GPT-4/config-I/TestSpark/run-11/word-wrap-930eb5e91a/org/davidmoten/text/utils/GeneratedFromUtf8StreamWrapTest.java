package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedFromUtf8StreamWrapTest {

    @Test
    public void fromUtf8StreamWrapTest() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("This is a UTF-8 wrap test.".getBytes());

        String wrappedText = WordWrap.from(inputStream, StandardCharsets.UTF_8)
                .maxWidth(5)
                .wrap();

        assertEquals("This\nis a\nUTF-8\nwrap\ntest.", wrappedText);
    }

}