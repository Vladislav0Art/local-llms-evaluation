package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = new File("testfile.txt");
        assertNotNull(WordWrap.from(file, Charset.defaultCharset()));
    }

}