package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class GeneratedCloseTest {

    @Test
    public void closeTest() {
        WordWrap.close(new BufferedReader(new StringReader("Test string")));
    }

}