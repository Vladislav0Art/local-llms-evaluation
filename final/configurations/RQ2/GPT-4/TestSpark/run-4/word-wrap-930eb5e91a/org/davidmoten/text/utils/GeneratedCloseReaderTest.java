package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedCloseReaderTest {

    @Test
    public void closeReaderTest() throws IOException {
        BufferedReader reader = Mockito.mock(BufferedReader.class);
        Mockito.doNothing().when(reader).close();
        WordWrap.close(reader);
        Mockito.verify(reader, Mockito.times(1)).close();
    }

}