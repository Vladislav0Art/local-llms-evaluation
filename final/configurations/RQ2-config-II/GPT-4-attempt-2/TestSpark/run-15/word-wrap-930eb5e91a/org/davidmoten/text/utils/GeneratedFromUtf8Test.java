package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromUtf8(new ByteArrayInputStream("Test".getBytes()));
        assertEquals(builder.reader.getClass(), BufferedReader.class);
    }

}