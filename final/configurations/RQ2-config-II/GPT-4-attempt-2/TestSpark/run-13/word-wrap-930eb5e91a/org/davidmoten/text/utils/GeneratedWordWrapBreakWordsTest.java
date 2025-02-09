package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapBreakWordsTest {

    @Test
    public void wordWrapBreakWordsTest() throws IOException {
        String inputStr = "Java is an Object Oriented Programming Language predominantly used for building enterprise level applications.";
        Reader in = new StringReader(inputStr);
        Writer out = new StringWriter();
        Function<? super CharSequence, ? extends Number> stringWidth = input -> input.length();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 10, stringWidth, extraWordChars, false, true);
        assertTrue(out.toString().contains("\n"));
    }

}