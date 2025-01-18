package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.StringBuilder2;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedLeftTrimTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void leftTrimTest() {
        StringBuilder2 stringBuilder = new StringBuilder2("   test");
        WordWrap.leftTrim(stringBuilder);
        assertEquals("test", stringBuilder.toString());
    }

}