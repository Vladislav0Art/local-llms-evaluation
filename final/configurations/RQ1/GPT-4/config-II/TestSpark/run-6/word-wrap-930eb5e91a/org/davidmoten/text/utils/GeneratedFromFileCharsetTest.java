package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        File file = new File("test.txt");
        Charset charset = StandardCharsets.UTF_8;
        try {
            String text = "";
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] strToBytes = text.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();

            WordWrap.Builder result = WordWrap.from(file, charset);
            assertNotNull(result);

        } catch (IOException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }

}