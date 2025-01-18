package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        assertNotNull(WordWrap.from(new File("src/test/resources/wordwrap.txt"), Charset.defaultCharset()));
    }

}