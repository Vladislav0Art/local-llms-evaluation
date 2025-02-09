package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("Test");
        WordWrap.Builder builder = WordWrap.from(reader);
        assertEquals(builder.reader.getClass(), BufferedReader.class);
    }

}