package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() throws FileNotFoundException {
        File file = new File("testFile.txt");
        assertNotNull(WordWrap.fromUtf8(file.toURI().toURL().openStream()));
    }

}