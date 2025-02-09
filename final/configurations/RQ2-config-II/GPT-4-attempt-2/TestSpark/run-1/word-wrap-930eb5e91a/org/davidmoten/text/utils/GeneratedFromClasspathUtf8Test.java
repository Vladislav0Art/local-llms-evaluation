package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() throws FileNotFoundException {
        assertNotNull(WordWrap.fromClasspathUtf8("testFile.txt"));
    }

}