package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWordWrapLineConsumerTest {

    @Test
    public void wordWrapLineConsumerTest() throws IOException {
        Reader reader = new StringReader("This is another test");
        LineConsumer consumer = Mockito.mock(LineConsumer.class);
        Function<CharSequence, Integer> fun = s -> s.length();
        WordWrap.wordWrap(reader, consumer, 10, fun, Collections.emptySet(), false, true);
        Mockito.verify(consumer, Mockito.times(3)).accept(Mockito.anyString());
    }

}