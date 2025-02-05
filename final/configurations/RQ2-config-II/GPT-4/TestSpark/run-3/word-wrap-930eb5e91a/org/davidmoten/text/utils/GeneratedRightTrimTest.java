package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        assertEquals("Test  ", WordWrap.rightTrim("Test  "));
        assertEquals("Test", WordWrap.rightTrim("Test"));
        assertEquals("Test", WordWrap.rightTrim("Test "));
    }

}