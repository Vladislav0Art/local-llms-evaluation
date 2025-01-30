package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedFromCharSequenceWrapTest {

    @Test
    public void fromCharSequenceWrapTest() {
        CharSequence text = "This is another test for word wrap function.";

        String wrappedText = WordWrap.from(text)
                .maxWidth(15)
                .wrap();

        assertEquals("This is\nanother test\nfor word wrap\nfunction.", wrappedText);
    }

}