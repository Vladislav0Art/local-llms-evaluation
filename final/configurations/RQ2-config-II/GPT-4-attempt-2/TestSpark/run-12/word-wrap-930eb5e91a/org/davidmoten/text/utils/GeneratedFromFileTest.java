package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() throws FileNotFoundException {
        File file = Mockito.mock(File.class);
        assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

}