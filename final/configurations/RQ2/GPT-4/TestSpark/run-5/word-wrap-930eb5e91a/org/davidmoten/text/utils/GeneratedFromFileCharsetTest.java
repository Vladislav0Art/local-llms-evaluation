package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws FileNotFoundException {
        File file = new File("test.txt");
        PrintWriter out = new PrintWriter("test.txt");
        out.println("Hello, World!");
        out.close();
        Assert.assertNotNull(WordWrap.from(file, java.nio.charset.StandardCharsets.UTF_8));
    }

}