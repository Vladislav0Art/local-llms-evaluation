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

public class GeneratedWordWrap_ReaderOut_NoWrapper {

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

}