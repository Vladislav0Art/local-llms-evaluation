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

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = Mockito.mock(File.class);
        Mockito.when(file.exists()).thenReturn(true);
        Mockito.when(file.isFile()).thenReturn(true);
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

}