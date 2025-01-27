package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeneratedWordWrapWriterConsumesInputReader {

    @Test
    public void wordWrapWriterConsumesInputReader() throws IOException {
        Reader in = new InputStreamReader(System.in);
        Writer out = new StringWriter();
        WordWrap.wordWrap(in, out, "\n", 10.0d, (String s) -> 5.0d, new HashSet<>(), false, false);
        assertNotNull(out);
    }

}