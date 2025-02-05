package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedWordWrapLineConsumerTest {

    @Test
    public void wordWrapLineConsumerTest() {
        Set<Character> extras = new HashSet<>();
        extras.add('-');
        try {
            StringReader in = new StringReader("This is a fairly long piece of text that needs wrapping");
            StringWriter out = new StringWriter();
            LineConsumer consumer = Mockito.mock(LineConsumer.class);
            WordWrap.wordWrap(in, consumer, 10,
                    (cs -> cs.length()), extras, true, true);
            Mockito.verify(consumer, Mockito.times(6)).accept(Mockito.anyString());
        } catch (IOException e) {
            fail();
        }
    }

}