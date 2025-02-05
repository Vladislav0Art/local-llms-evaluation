package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedWordWrap2Test {

    @Test
    public void wordWrap2Test() {
        LineConsumer out = Mockito.mock(LineConsumer.class);
        StringReader in = new StringReader("Hello World");
        Set<Character> extraWordChars = new HashSet<>();
        WordWrap.wordWrap(in, out, 10, str -> str.length(), extraWordChars, true, true);
        Mockito.verify(out, Mockito.times(2)).accept(Mockito.anyString());
    }

}