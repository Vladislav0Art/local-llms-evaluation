package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromStreamCharsetTest {

    @Test
    public void fromStreamCharsetTest() throws FileNotFoundException {
        InputStream in = new FileInputStream("src/test/resources/wordwrap.txt");
        assertNotNull(WordWrap.from(in, Charset.defaultCharset()));
    }

}