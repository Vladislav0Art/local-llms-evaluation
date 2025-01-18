package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedCloseTest {

    @Test
    public void closeTest() throws FileNotFoundException {
        Reader reader = Mockito.mock(Reader.class);
        WordWrap.close(reader);
        Mockito.verify(reader, Mockito.times(1)).close();
    }

}