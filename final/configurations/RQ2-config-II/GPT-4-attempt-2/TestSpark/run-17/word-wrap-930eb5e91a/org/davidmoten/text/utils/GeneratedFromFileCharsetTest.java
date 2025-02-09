package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws FileNotFoundException {
        File file = new File("test.txt");
        Builder result = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(result);
    }

}