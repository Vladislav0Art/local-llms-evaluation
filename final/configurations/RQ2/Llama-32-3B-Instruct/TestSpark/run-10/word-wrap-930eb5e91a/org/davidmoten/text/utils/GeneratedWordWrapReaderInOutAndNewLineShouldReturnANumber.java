package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedWordWrapReaderInOutAndNewLineShouldReturnANumber {

    @Test
    public void wordWrapReaderInOutAndNewLineShouldReturnANumber() {
        Reader in = new BufferedReader(new InputStreamReader(System.in));
        Writer out = new StringWriter();
        String newLine = "\n";
        int maxWidth = 20;
        Function<String, Number> stringWidth = s -> s.length();
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        try {
            WordWrap.wordWrap(in, out, newLine, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

}