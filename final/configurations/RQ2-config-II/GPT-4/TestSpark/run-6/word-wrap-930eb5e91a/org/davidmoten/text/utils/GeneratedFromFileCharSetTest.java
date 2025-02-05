package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromFileCharSetTest {

    @Test
    public void fromFileCharSetTest() throws FileNotFoundException {
        File file = Mockito.mock(File.class);
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

}