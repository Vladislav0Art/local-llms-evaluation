package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedFromFileAndCharsetTest {

    @Test
    public void fromFileAndCharsetTest() {
        File file = new File("test.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("Test String".getBytes());
            fos.close();
            assertNotNull(WordWrap.from(file, java.nio.charset.StandardCharsets.UTF_8));
            file.delete();
        } catch (IOException e) {
            fail("Unexpected exception thrown");
        }
    }

}