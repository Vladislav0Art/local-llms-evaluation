package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Reader in = new StringReader("Testing fromReader method.");
        WordWrap.Builder builder = WordWrap.from(in);
        assertNotNull(builder);
    }

}