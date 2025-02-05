package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws FileNotFoundException {
        File file = new File("test.txt");
        WordWrap.Builder builder = WordWrap.from(file, Charset.defaultCharset());
        assertNotNull(builder);
    }

}