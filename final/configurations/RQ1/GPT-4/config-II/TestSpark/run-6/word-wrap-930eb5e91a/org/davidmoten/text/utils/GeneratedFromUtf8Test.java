package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream in = new ByteArrayInputStream("test".getBytes());
        WordWrap.Builder result = WordWrap.fromUtf8(in);
        assertNotNull(result);
    }

}