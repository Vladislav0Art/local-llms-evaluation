package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() throws IOException {
        Reader reader = new StringReader("test");
        Builder result = WordWrap.from(reader);
        assertNotNull(result);
    }

}