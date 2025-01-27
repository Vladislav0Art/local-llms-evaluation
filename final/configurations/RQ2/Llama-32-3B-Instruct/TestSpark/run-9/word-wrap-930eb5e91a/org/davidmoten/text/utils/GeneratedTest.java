package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void from_Reader_ReturnsBuilder() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        Builder builder = WordWrap.from(reader);
        Assert.assertNotNull(builder);
    }

    @Test
    public void fromClasspathUtf8_SimpleResource() {
        String resource = "text";
        Builder builder = WordWrap.fromClasspathUtf8(resource);
        Assert.assertNotNull(builder);
    }

    @Test
    public void from_Reader_Close() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        when(WordWrap.class).thenAnswer((ans) -> {
            return ans.get();
        });
        Builder builder = WordWrap.from(reader, true);
        builder.build();
        Assert.assertTrue(WordWrap.class).getClose(reader);
    }

    @Test
    public void wordWrap_ReaderOut_Wrapper() {
        String text = "text";
        Writer out = new StringWriter();
        Number maxWidth = 20L;
        Function<? super CharSequence, ? extends Number> stringWidth = (s) -> s.length();
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(new BufferedReader(new StringReader(text)), out, "line", maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
        Assert.assertEquals(1, out.toString().split("\n").length);
    }

    @Test
    public void wordWrap_ReaderOut_NoWrapper() {
        String text = "text";
        Writer out = new StringWriter();
        Number maxWidth = 5L;
        Function<? super CharSequence, ? extends Number> stringWidth = (s) -> s.length();
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(new BufferedReader(new StringReader(text)), out, "line", maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
        Assert.assertEquals(1, out.toString().split("\n").length);
    }

    @Test
    public void rightTrim_String_ReturnsRightTrimmedString() {
        String s = "   ";
        CharSequence trimmed = WordWrap.rightTrim(s.toString());
        org.junit.Assert.assertEquals("   ", trimmed.toString());
    }

    @Test
    public void isWhitespace_CharSequence_ReturnsTrueIfWhitespace() {
        String text = "";
        org.junit.Assert.assertTrue(WordWrap.isWhitespace(text));
    }

    @Test
    public void leftTrim_StringBuilder2_AppendsSpacesToStart() {
        StringBuilder word = new StringBuilder();
        WordWrap.leftTrim(word);
        org.junit.Assert.assertEquals("  ", word.toString());
    }

}