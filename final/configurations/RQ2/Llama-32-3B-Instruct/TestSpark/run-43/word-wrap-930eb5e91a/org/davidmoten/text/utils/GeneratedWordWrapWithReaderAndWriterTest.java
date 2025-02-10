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
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedWordWrapWithReaderAndWriterTest {

    @Test
    public void wordWrapWithReaderAndWriterTest() throws IOException {
        Reader in = new BufferedReader(new InputStreamReader(System.in));
        Writer out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 10L, s -> s.length(), null, false, true);
        assertTrue(out.toString().contains("\n"));
    }

}