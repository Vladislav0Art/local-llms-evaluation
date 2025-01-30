package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void fromUtf8Test() {
        InputStream stream = new ByteArrayInputStream("Hello, world!".getBytes());
        WordWrap.Builder builder = WordWrap.fromUtf8(stream);
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromReaderWithCloseTest() {
        StringReader reader = new StringReader("");
        WordWrap.Builder builder = WordWrap.from(reader);
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromReaderWithoutCloseTest() {
        StringReader reader = new StringReader("");
        WordWrap.Builder builder = WordWrap.from(reader, false);
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromFileTest() {
        try {
            File tempFile = File.createTempFile("prefix", "suffix");
            tempFile.deleteOnExit();
            WordWrap.Builder builder = WordWrap.from(tempFile, Charset.forName("UTF-8"));
            assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
        } catch (Exception ex) {
            fail("Should not have thrown any exception.");
        }
    }

    @Test
    public void fromClasspathUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("res");
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder builder = WordWrap.fromClasspath("res", Charset.forName("UTF-8"));
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromStringTest() {
        WordWrap.Builder builder = WordWrap.from("Hello, world!");
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void fromInputStreamCharsetTest() {
        WordWrap.Builder builder = WordWrap.from(new ByteArrayInputStream("hello".getBytes()), Charset.forName("UTF-8"));
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

    @Test
    public void builderWrapToStringTest() {
        final String EXPECTED_RESULT = "Hello,\nworld!";
        WordWrap.Builder builder = WordWrap.from("Hello, world!");
        builder.maxWidth(7);
        assertEquals(EXPECTED_RESULT, builder.wrap());
    }

    @Test
    public void builderWrapToListTest() {
        final List<String> EXPECTED_RESULT = Arrays.asList("Hello,", "world!");
        WordWrap.Builder builder = WordWrap.from("Hello, world!");
        builder.maxWidth(7);
        assertEquals(EXPECTED_RESULT, builder.wrapToList());
    }

    @Test
    public void builderWriteWordsWithHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Supercalifragilisticexpialidocious");
        builder.insertHyphens(true);
        builder.maxWidth(10);
        String result = builder.wrap();
        assertFalse("Must contain hyphen in the result.", !result.contains("-"));
    }

    @Test
    public void builderNoHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Supercalifragilisticexpialidocious");
        builder.insertHyphens(false);
        builder.maxWidth(10);
        String result = builder.wrap();
        assertFalse("Should not contain hyphen in the result.", result.contains("-"));
    }

    @Test
    public void builderNoBreakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("Supercalifragilisticexpialidocious");
        builder.breakWords(false);
        builder.maxWidth(10);
        String result = builder.wrap();
        assertTrue("Should contains original word in the result.", result.contains("Supercalifragilisticexpialidocious"));
    }

    @Test
    public void builderExtraWordCharsTest() {
        WordWrap.Builder builder = WordWrap.from("Hello, world!");
        builder.extraWordChars(new HashSet<>(Collections.singletonList(',')));
        String result = builder.wrap();
        assertTrue("Should contains ',' in the result.", result.contains(","));
    }

    @Test
    public void builderMaxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("Hello, world!");
        try {
            builder.maxWidth(0);
            fail("Should have thrown an exception.");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}