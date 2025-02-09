package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import org.junit.Test;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        HashSet<Character> extraWordChars = new HashSet<>();
        extraWordChars.add(',');
        Function<CharSequence, Integer> testStringWidth = sequence -> sequence.length();
        WordWrap.wordWrap(new StringReader("This is a test"), new StringWriter(), "\n", 80,
                testStringWidth, extraWordChars, true, true);
    }

}