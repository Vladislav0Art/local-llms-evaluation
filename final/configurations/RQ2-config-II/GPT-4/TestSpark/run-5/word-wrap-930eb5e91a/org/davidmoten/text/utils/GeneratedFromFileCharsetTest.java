package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws IOException {
        Charset charset = Charset.forName("UTF-8");
        File testFile = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(testFile);
        Writer out = new OutputStreamWriter(fos, charset);
        out.write("Hello World");
        out.close();
        WordWrap.Builder builder = WordWrap.from(testFile, charset);
        Assert.assertNotNull(builder);
        testFile.delete();
    }

}