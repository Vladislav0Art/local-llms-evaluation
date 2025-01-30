package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedFromFileAndCharsetFileNotFoundExceptionTest {

    @Test
    public void fromFileAndCharsetFileNotFoundExceptionTest() throws FileNotFoundException {
        File file = mock(File.class);
        FileInputStream fileInputStream = mock(FileInputStream.class);
        when(new FileInputStream(file)).thenThrow(FileNotFoundException.class);
        WordWrap.from(file, StandardCharsets.UTF_8);
    }

}