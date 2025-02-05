package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedFromFileWithCharsetTest {

    @Test
    public void fromFileWithCharsetTest() {
        File file = new File("testFile.txt");
        Assert.assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

}