package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedWordWrap1Test {

    @Test
    public void wordWrap1Test() {
        StringReader in = new StringReader("Hello World");
        StringWriter out = new StringWriter();
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, "\n", 10, str -> str.length(), extraWordChars, true, true);
        Assert.assertNotEquals("", out.toString());
    }

}