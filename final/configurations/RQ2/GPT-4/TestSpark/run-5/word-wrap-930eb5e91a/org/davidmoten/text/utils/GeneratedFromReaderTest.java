package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        String text = "Hello, World!";
        Reader reader = new StringReader(text);
        Assert.assertNotNull(WordWrap.from(reader));
    }

}