package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() throws FileNotFoundException {
        Reader reader = new InputStreamReader(new FileInputStream("src/test/resources/wordwrap.txt"));
        assertNotNull(WordWrap.from(reader));
    }

}