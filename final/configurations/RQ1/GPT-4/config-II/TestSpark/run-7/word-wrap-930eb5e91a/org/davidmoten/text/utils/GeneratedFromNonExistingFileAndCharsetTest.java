package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedFromNonExistingFileAndCharsetTest {

    @Test
    public void fromNonExistingFileAndCharsetTest() {
        File file = new File("non-existing.txt");
        WordWrap.from(file, java.nio.charset.StandardCharsets.UTF_8);
    }

}