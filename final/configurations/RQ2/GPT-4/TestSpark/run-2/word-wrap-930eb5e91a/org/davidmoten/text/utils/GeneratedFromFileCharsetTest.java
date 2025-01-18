package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws FileNotFoundException {
        File file = new File("src/test/resources/testFile.txt");
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}