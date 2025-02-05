package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedFromInputStreamWithCharsetTest {

    @Test
    public void fromInputStreamWithCharsetTest() throws FileNotFoundException {
        File file = new File("testFile");
        InputStream in = new FileInputStream(file);
        assertNotNull(WordWrap.from(in, StandardCharsets.UTF_8));
    }

}