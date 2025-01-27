package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedWordWrapReaderWithLineConsumerAndMaxWidthBuilderShouldReturnWordWrappedLine {

    @Test
    public void wordWrapReaderWithLineConsumerAndMaxWidthBuilderShouldReturnWordWrappedLine() throws IOException {
        WordWrap.LineConsumer consumer = new WordWrap.LineConsumer(new StringBuilder2());
        WordWrap.wordWrap(WordWrap.from(new String[]{"Hello", "World"}).writer(), consumer, "\n", 10,
                (s) -> s.length(), new HashSet<>(), false, true);
        assertEquals("He\nlo World\n", consumer.toString());
    }

}

class StringBuilder2 extends StringBuilder {
    public CharSequence substring(int begin) {
        return substring(begin, this.length());
    }
}

}