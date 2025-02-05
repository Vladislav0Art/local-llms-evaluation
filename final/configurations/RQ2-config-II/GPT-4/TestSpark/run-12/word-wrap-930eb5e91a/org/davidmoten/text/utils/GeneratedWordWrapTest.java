package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class GeneratedWordWrapTest {

    @Test
    public void wordWrapTest() throws IOException {
        StringReader in = new StringReader("This is a test");
        StringWriter out = new StringWriter();

        WordWrap.wordWrap(
                in,
                out,
                "\n",
                80,
                value -> value.length(),
                new HashSet<>(),
                true,
                true);

        Assert.assertEquals("This is a test", out.toString());
    }

}