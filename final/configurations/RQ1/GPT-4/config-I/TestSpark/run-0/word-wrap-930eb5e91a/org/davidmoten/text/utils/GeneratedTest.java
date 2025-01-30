package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private String testText = "This is a simple test text to be used for testing word wrap functionality";

    @Test
    public void fromReaderTest() {
        Builder builder = WordWrap.from(new StringReader(testText));
        assertNotNull(builder);
    }

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from(testText);
        assertNotNull(builder);
    }

    @Test
    public void fromUtf8Test() {
        Builder builder = WordWrap.fromUtf8(System.in);
        assertNotNull(builder);
    }

    @Test
    public void fromInputStreamCharsetTest() {
        Builder builder = WordWrap.from(System.in, StandardCharsets.UTF_16);
        assertNotNull(builder);
    }

    @Test
    public void alignSelfTest() {
        String expected = "This is a simple test\n" +
                "text to be used for\n" +
                "testing word wrap\n" +
                "functionality";
        Builder builder = WordWrap.from(testText).maxWidth(20);
        String result = builder.wrap();
        assertEquals(expected, result);
    }

}